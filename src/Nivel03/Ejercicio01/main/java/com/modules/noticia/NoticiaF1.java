package Nivel03.Ejercicio01.main.java.com.modules.noticia;

public class NoticiaF1 extends Noticia {
    private String escuderia;

    public NoticiaF1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
        calcularPuntuacion();
        calcularPrecio();
    }

    @Override
    public void calcularPuntuacion() {
        puntuacion = 4;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) puntuacion += 2;
    }

    @Override
    public void calcularPrecio() {
        precio = 100;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) precio += 50;
    }
}

