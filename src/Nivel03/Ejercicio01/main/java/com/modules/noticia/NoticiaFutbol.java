package Nivel03.Ejercicio01.main.java.com.modules.noticia;

public class NoticiaFutbol extends Noticia {
    private String competicion;
    private String club;
    private String jugador;

    public NoticiaFutbol(String titular, String competicion, String club, String jugador) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
        calcularPuntuacion();
        calcularPrecio();
    }

    @Override
    public void calcularPuntuacion() {
        puntuacion = 5;
        if (competicion.equals("Liga de Campeones")) puntuacion += 3;
        if (competicion.equals("Liga")) puntuacion += 2;
        if (club.equals("Barça") || club.equals("Madrid")) puntuacion += 1;
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) puntuacion += 1;
    }

    @Override
    public void calcularPrecio() {
        precio = 300;
        if (competicion.equals("Liga de Campeones")) precio += 100;
        if (club.equals("Barça") || club.equals("Madrid")) precio += 100;
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) precio += 50;
    }
}
