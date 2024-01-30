package formularios;

import formularios.BordeResaltadoDecorator;
import formularios.PedidoAlmacenFormulario;


public class Main {
    public static void main(String[] args) {
        // Crear un formulario de pedido al almacén y procesarlo
        Formulario formulario = new PedidoAlmacenFormulario();
        formulario = new BordeResaltadoDecorator(formulario, "rojo", 2);
        formulario.mostrar();

        
    }
}
