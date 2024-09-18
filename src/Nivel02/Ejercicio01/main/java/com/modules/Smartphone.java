package Nivel02.Ejercicio01.main.java.com.modules;

public class Smartphone extends Teléfono implements Cámara, Reloj {

        public Smartphone(String marca, String modelo) {
            super(marca, modelo);
        }
        @Override
        public void fotografiar(){
            System.out.println("Se está haciendo una foto");
        }

        @Override
        public void alarma(){
            System.out.println("Está sonando la alarma");
        }

}
