# Inyeccion de dependencias

## Rediseño de la interfaz Quest

-  Para rediseñar la interfaz Quest del ejemplo KnightsOfTheRoundTable sin utilizar java.lang.Object como tipo genérico, puedes utilizar una variable de tipo genérico en la interfaz. Aquí tienes un ejemplo de cómo podría verse el rediseño:

```
public interface Quest<T> {
    T embark() throws QuestFailedException;
}
```

- Luego, puedes modificar la clase HolyGrailQuest para que implemente la interfaz Quest utilizando el tipo genérico:

```
public class HolyGrailQuest implements Quest<HolyGrail> {
    public HolyGrailQuest() { /*...*/ }

    public HolyGrail embark() throws QuestFailedException {
        HolyGrail grail = null;
        // Buscar el Grial...
        return grail;
    }
}
```

- De esta manera, la interfaz Quest y su implementación HolyGrailQuest pueden trabajar con un tipo específico (HolyGrail en este caso) en lugar de utilizar java.lang.Object.


## Implementar el ejemplo mediante un framework de inyeccion de dependencias mediante Spring

1. Configuración de Spring: Define los beans necesarios en un archivo de configuración de Spring (por ejemplo, un archivo XML o una clase de configuración anotada).

```
<!-- Definición del bean HolyGrailQuest -->
<bean id="holyGrailQuest" class="com.example.HolyGrailQuest" />

<!-- Configuración del bean KnightOfTheRoundTable que utiliza la dependencia HolyGrailQuest -->
<bean id="knightOfTheRoundTable" class="com.example.KnightOfTheRoundTable">
    <constructor-arg value="John Doe" />
    <property name="quest" ref="holyGrailQuest" />
</bean>
```

2. Creación de la clase KnightOfTheRoundTable con inyección de dependencias:

```
public class KnightOfTheRoundTable implements Knight {
    private String name;
    private Quest quest;

    public KnightOfTheRoundTable(String name) {
        this.name = name;
    }

    public Object embarkOnQuest() throws QuestFailedException {
        return quest.embark();
    }

    // Getter y setter para la propiedad 'quest'

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public Quest getQuest() {
        return quest;
    }
}
```

- En este ejemplo, la clase KnightOfTheRoundTable tiene una dependencia de la interfaz Quest, que se inyecta a través del método setQuest().

3. Obtener la instancia de KnightOfTheRoundTable desde el contexto de Spring:

```
ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
KnightOfTheRoundTable knight = context.getBean("knightOfTheRoundTable", KnightOfTheRoundTable.class);

// Utilizar la instancia knight para realizar las operaciones deseadas
```

- En este punto, puedes obtener una instancia de KnightOfTheRoundTable del contexto de Spring, y todas las dependencias se resolverán automáticamente.
