package formularios;


public abstract class FormularioDecorator implements Formulario {
    protected Formulario formularioDecorado;

    public FormularioDecorator(Formulario formularioDecorado) {
        this.formularioDecorado = formularioDecorado;
    }

    @Override
    public void mostrar() {
        formularioDecorado.mostrar();
    }
}

