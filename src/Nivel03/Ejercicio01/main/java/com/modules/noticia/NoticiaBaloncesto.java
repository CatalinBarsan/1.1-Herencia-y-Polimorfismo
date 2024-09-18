package Nivel03.Ejercicio01.main.java.com.modules.noticia;

public class NoticiaBaloncesto extends Noticia {
    private String competicion;
    private String club;

    public NoticiaBaloncesto(String titular, String competicion, String club) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
    }

    @Override
    public void calcularPuntuacion() {
        puntuacion = 4;
        if (competicion.equals("Euroliga")) puntuacion += 3;
        if (competicion.equals("ACB")) puntuacion += 2;
        if (club.equals("Barça") || club.equals("Madrid")) puntuacion += 1;
    }

    @Override
    public void calcularPrecio() {
        precio = 250;
        if (competicion.equals("Euroliga")) precio += 75;
        if (club.equals("Barça") || club.equals("Madrid")) precio += 75;
    }
}
