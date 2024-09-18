package Nivel01.Ejercicio01.main.java.com.modules;


public class InstrumentoViento extends Instrumento {

    {

        System.out.println("Bloque estático de InstrumentoViento: Clase InstrumentoViento cargada.");

    }

    public InstrumentoViento(String nombre, double precio) {

        super(nombre, precio);

    }

    @Override
    public void tocar(){

        System.out.println("Está sonando un instrumento de viento");

    }
}
