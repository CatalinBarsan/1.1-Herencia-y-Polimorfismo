package Nivel01.Ejercicio01.main.java.com.modules;


public class InstrumentoCuerda extends Instrumento {

    static {

        System.out.println("Bloque estático de InstrumentoCuerda: Clase InstrumentoCuerda cargada.");

    }

    public InstrumentoCuerda(String nombre, double precio) {

        super(nombre, precio);

    }

    @Override
    public void tocar(){

        System.out.println("Está sonando un instrumento de cuerda");

    }
}
