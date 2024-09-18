package Nivel03.Ejercicio01.main.java.com.modules.noticia;

public abstract class Noticia {
    protected String titular;
    protected String texto;
    protected int puntuacion;
    protected double precio;

    public Noticia(String titular) {
        this.titular = titular;
        this.texto = "";
    }

    public abstract void calcularPuntuacion();
    public abstract void calcularPrecio();

    public String getTitular() {
        return titular;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public double getPrecio() {
        return precio;
    }
}