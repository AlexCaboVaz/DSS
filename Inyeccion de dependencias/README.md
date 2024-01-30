# CABALLEROS

## Cambios realizados

1. Interfaz Quest: Hemos introducido una interfaz llamada Quest que define un método embark() para realizar una búsqueda. Esto permite una mayor flexibilidad en la implementación de diferentes tipos de búsquedas en el futuro.

2. Clase HolyGrailQuest implementa Quest: La clase HolyGrailQuest ahora implementa la interfaz Quest. Esto garantiza que cada búsqueda debe proporcionar una implementación de embark().

3. Constructor para la búsqueda del Santo Grial: Hemos agregado un constructor para la clase HolyGrailQuest que permite configurar la búsqueda de manera más personalizada si fuera necesario en el futuro.

## Beneficios de los cambios

- Los cambios realizados tienen los siguientes beneficios:

- Mayor flexibilidad: Ahora es más fácil agregar diferentes tipos de búsquedas implementando la interfaz Quest.
- Mayor claridad: La separación de responsabilidades entre las clases KnightOfTheRoundTable, HolyGrailQuest y HolyGrail es más clara.
- Potencial para personalización: La adición del constructor personalizado en HolyGrailQuest permite configurar búsquedas de manera más detallada si fuera necesario.

## Ejecución

Clona o descarga este repositorio en tu máquina local.
Abre el proyecto en tu IDE de preferencia, como IntelliJ IDEA o Eclipse.
Ejecuta el código desde el main y veras los resultados
