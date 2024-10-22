package Nivel01.Ejercicio02.main.java.com.modules;

public class Coche {


    public static String marca = "Toyota";
    public static String modelo;
    public final int potencia;

    public Coche(int potencia) {

       this.potencia = potencia;

    }

    public static void frenar(){
        System.out.println("El vehiculo esta frenando");
    }

    public void accelerar(){
        System.out.println("El vehiculo esta accelerando");
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

}
