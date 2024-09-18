package Nivel01.Ejercicio01.main.java.com.modules;

abstract class Instrumento {

    protected String nombre;
    protected double precio;

    {
        System.out.println("Bloque de inicialización de instancia de Instrumento.");
    }

    static {
        System.out.println("Bloque estático de Instrumento: Clase Instrumento cargada.");
    }

    public Instrumento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

   public
   abstract void tocar();
}
