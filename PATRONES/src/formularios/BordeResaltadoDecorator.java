package formularios;

public class BordeResaltadoDecorator extends FormularioDecorator {
    private String color;
    private int grosor;

    public BordeResaltadoDecorator(Formulario formularioDecorado, String color, int grosor) {
        super(formularioDecorado);
        this.color = color;
        this.grosor = grosor;
    }

    @Override
    public void mostrar() {
        // Agregar el resaltado con el borde especificado
        System.out.println("Formulario con borde resaltado (" + color + ", " + grosor + ")");
        super.mostrar();
    }
}