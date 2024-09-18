package Nivel03.Ejercicio01.main.java.com.modules.noticia;

public class NoticiaMotociclismo extends Noticia {
    private String equipo;

    public NoticiaMotociclismo(String titular, String equipo) {
        super(titular);
        this.equipo = equipo;
        calcularPuntuacion();
        calcularPrecio();
    }

    @Override
    public void calcularPuntuacion() {
        puntuacion = 3;
        if (equipo.equals("Honda") || equipo.equals("Yamaha")) puntuacion += 3;
    }

    @Override
    public void calcularPrecio() {
        precio = 100;
        if (equipo.equals("Honda") || equipo.equals("Yamaha")) precio += 50;
    }
}
