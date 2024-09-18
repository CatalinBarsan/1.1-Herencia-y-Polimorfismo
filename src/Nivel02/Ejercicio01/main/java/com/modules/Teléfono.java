package Nivel02.Ejercicio01.main.java.com.modules;

public class Teléfono {
    private String marca;
    private String modelo;

    public Teléfono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void llamar(String numero) {
        System.out.println("Estas llamando al nr: " + numero);
    }
}
