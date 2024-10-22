package Nivel01.Ejercicio02;

import Nivel01.Ejercicio02.main.java.com.modules.Coche;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Coche.frenar();
        Coche coche = new Coche(145);
        coche.modelo = "Yaris";
        coche.accelerar();
        System.out.println(coche.marca+ " " + coche.modelo + " " + coche.potencia);


        Coche coche2 = new Coche(154);
        System.out.println(coche2.marca+ " " + coche2.modelo + " " + coche2.potencia);

        
    }
}