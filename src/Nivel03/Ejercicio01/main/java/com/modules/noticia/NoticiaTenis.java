package Nivel03.Ejercicio01.main.java.com.modules.noticia;

public class NoticiaTenis extends Noticia {
    private String competicion;
    private String tenista;

    public NoticiaTenis(String titular, String competicion, String tenista) {
        super(titular);
        this.competicion = competicion;
        this.tenista = tenista;
        calcularPuntuacion();
        calcularPrecio();
    }

    @Override
    public void calcularPuntuacion() {
        puntuacion = 4;
        if (tenista.equals("Federer") || tenista.equals("Navidad") || tenista.equals("Djokovic")) puntuacion += 3;
    }

    @Override
    public void calcularPrecio() {
        precio = 150;
        if (tenista.equals("Federer") || tenista.equals("Navidad") || tenista.equals("Djokovic")) precio += 100;
    }
}

