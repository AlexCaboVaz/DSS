# PATRONES

## Parte A: Aplicación del Patrón Command

- Paso 1: Creación de la Interfaz Command
En esta parte, se ha aplicado el patrón Command. Aquí están los pasos clave:

Creación de la Interfaz Command: Se ha creado la interfaz Command que define un método execute() para ejecutar una acción específica. Esta interfaz actúa como un contrato para todas las clases de comandos que se implementarán.

- Paso 2: Implementación de Comandos
Se han implementado clases concretas que representan comandos específicos, como SubmitCommand, SaveCommand, y PrintCommand. Cada clase de comando implementa la interfaz Command y proporciona su propia lógica de ejecución.

- Paso 3: Creación del Invocador
Se ha creado una clase llamada Formulario que actúa como el "invocador". Esta clase tiene un método para asignar un comando y otro método para ejecutar el comando. Esto permite que el formulario interactúe con diferentes comandos de manera flexible.

- Paso 4: Uso del Patrón Command
En el código, se crea una instancia de Formulario y se le asigna un comando específico. Luego, se ejecuta el comando según sea necesario. Esto permite automatizar diversas acciones en un formulario, como enviar, guardar o imprimir.


## Diagrama de secuencia 

![Interaction Sequence diagram](https://github.com/AlexCaboVaz/DSS/assets/79449815/35db3861-0679-4e8d-a800-dc53456a1e39)


- En este diagrama, la empresa crea el formularioPedido, luego el Empleado lo procesa, lo cual lleva a la generación del pedido por parte del almacén, y finalmente el pedido es enviado al almacén.


## Parte C: Uso del Patrón Decorator para Formularios

En la parte C del ejercicio, se ha propuesto el uso del patrón Decorator para resaltar los formularios en función de diferentes criterios, como importancia y urgencia. A continuación, se describe cómo funciona este enfoque:

- Paso 1: Creación de la Interfaz Formulario
Se ha definido una interfaz Formulario que representa un formulario genérico. Esta interfaz incluye un método mostrar() que se utilizará para mostrar el formulario.

- Paso 2: Implementación de Formularios Concretos
Se han implementado clases concretas que representan diferentes tipos de formularios, como FormularioPedido, FormularioCompra, y FormularioAviso. Cada formulario implementa la interfaz Formulario y proporciona su propia implementación del método mostrar().

- Paso 3: Uso del Patrón Decorator
Se ha aplicado el patrón Decorator para agregar características adicionales a los formularios. Se han creado clases decoradoras como BordeResaltadoDecorator y BarraDesplazamientoDecorator. Cada decorador implementa la interfaz Formulario y tiene un formulario base como componente.

- Paso 4: Uso de Decoradores
En el código, se pueden crear instancias de formularios concretos y luego decorarlos según sea necesario. Por ejemplo, se puede crear un formulario de pedido y luego aplicar decoradores para resaltarlos y agregar barras de desplazamiento si es necesario

## Ejecucion

1. Clona o descarga este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE de preferencia, como IntelliJ IDEA o Eclipse.
3. Ejecuta desde el Main
