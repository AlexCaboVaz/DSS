# PATRONES

## Patron command

1. Crear una interfaz FormularioCommand que defina un método ejecutar() para ejecutar la acción correspondiente al formulario.

```
public interface FormularioCommand {
    void ejecutar();
}
```

2. Crear una implementación concreta de FormularioCommand para cada tipo de formulario. Por ejemplo, PedidoAlmacenCommand para el formulario que genera un pedido al almacén.

```
public class PedidoAlmacenCommand implements FormularioCommand {
    private PedidoAlmacen pedidoAlmacen;

    public PedidoAlmacenCommand(PedidoAlmacen pedidoAlmacen) {
        this.pedidoAlmacen = pedidoAlmacen;
    }

    public void ejecutar() {
        pedidoAlmacen.generarPedido();
    }
}
```

3. Crear una clase FormularioInvoker que invocará el comando correspondiente para cada tipo de formulario.

```
public class FormularioInvoker {
    private FormularioCommand command;

    public void setCommand(FormularioCommand command) {
        this.command = command;
    }

    public void procesarFormulario() {
        // Otras operaciones antes del procesamiento del formulario

        // Ejecutar el comando correspondiente
        command.ejecutar();

        // Otras operaciones después del procesamiento del formulario
    }
}
```

- Con esta implementación, se puede automatizar el procesamiento de diferentes tipos de formularios, generando distintas salidas según el tipo de formulario, sin afectar el resto de la aplicación.


## Diagrama de secuencia 



## Patron Decorator

- Para manejar la visualización de los distintos formularios, se puede utilizar el patrón de diseño Decorator. Este patrón permite agregar responsabilidades adicionales a un objeto de manera dinámica sin afectar al resto del código. En este caso, se puede utilizar el patrón Decorator para añadir características de visualización, como la barra de desplazamiento y los bordes de resaltado, a los formularios.

1. Crear una interfaz Formulario que represente el formulario base.

```
public interface Formulario {
    void mostrar();
}
```

2. Implementar la clase FormularioBase que implemente la interfaz Formulario.

```
public class FormularioBase implements Formulario {
    public void mostrar() {
        // Mostrar el formulario base
    }
}
```

3. Crear una clase abstracta FormularioDecorator que implemente la interfaz Formulario y tenga una referencia al formulario base.

```
public abstract class FormularioDecorator implements Formulario {
    protected Formulario formulario;

    public FormularioDecorator(Formulario formulario) {
        this.formulario = formulario;
    }

    public void mostrar() {
        formulario.mostrar();
    }
}
```

4. Crear clases concretas de decorador que agreguen características adicionales al formulario base, como la barra de desplazamiento y los bordes de resaltado.

```
public class FormularioConScroll extends FormularioDecorator {
    public FormularioConScroll(Formulario formulario) {
        super(formulario);
    }

    public void mostrar() {
        // Agregar la barra de desplazamiento al formulario
        formulario.mostrar();
    }
}

public class FormularioConBordeResaltado extends FormularioDecorator {
    private String color;
    private int grosor;

    public FormularioConBordeResaltado(Formulario formulario, String color, int grosor) {
        super(formulario);
        this.color = color;
        this.grosor = grosor;
    }

    public void mostrar() {
        // Agregar el borde de resaltado al formulario
        formulario.mostrar();
    }
}
```

- Con este diseño, se puede envolver un formulario con diferentes decoradores para agregar características de visualización adicionales, como la barra de desplazamiento y los bordes de resaltado, sin afectar el resto del código.