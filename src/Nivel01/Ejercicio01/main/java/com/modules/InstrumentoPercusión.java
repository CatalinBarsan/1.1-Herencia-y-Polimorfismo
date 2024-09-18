package Nivel01.Ejercicio01.main.java.com.modules;


public class InstrumentoPercusión extends Instrumento {

    static {

        System.out.println("Bloque estático de InstrumentoPercusion: Clase InstrumentoPersucion cargada.");

    }

    public InstrumentoPercusión(String nombre, double precio) {

        super(nombre, precio);

    }

    @Override
    public void tocar() {

        System.out.println("Está sonando un instrumento de percusion");

    }
}
