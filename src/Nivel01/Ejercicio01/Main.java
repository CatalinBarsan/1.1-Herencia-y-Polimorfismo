package Nivel01.Ejercicio01;
import Nivel01.Ejercicio01.main.java.com.modules.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nAccediendo al bloque estático de InstrumentoViento sin crear instancia...");
        System.out.println("\n"+ InstrumentoViento.class);
        System.out.println("\nCreando instancias de los instrumentos:");



        InstrumentoViento viento = new InstrumentoViento("Flauta",509.90);
        InstrumentoCuerda cuerda = new InstrumentoCuerda("Guitarra",599.90);
        InstrumentoPercusión percusion = new InstrumentoPercusión("Bateria", 850.99);


        System.out.println("\nTocando los instrumentos:");


        viento.tocar();
        cuerda.tocar();
        percusion.tocar();

    }

}
