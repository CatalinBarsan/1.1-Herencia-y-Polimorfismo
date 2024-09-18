package Nivel01.Ejercicio01.main.java.com.modules;


public class InstrumentoPercución extends Instrumento {

    static {

        System.out.println("Bloque estático de InstrumentoPercusion: Clase InstrumentoPersucion cargada.");

    }

    public InstrumentoPercución(String nombre, double precio) {

        super(nombre, precio);

    }

    @Override
    public void tocar() {

        System.out.println("Está sonando un instrumento de percusion");

    }
}
