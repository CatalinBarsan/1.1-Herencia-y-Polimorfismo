package Nivel03.Ejercicio01.main.java.com.modules.agencia;
import Nivel03.Ejercicio01.main.java.com.modules.noticia.Noticia;
import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private String nombre;
    private String dni;
    private double sueldo;
    private List<Noticia> noticias;

    public Redactor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = 1500;
        this.noticias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void agregarNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void eliminarNoticia(String titular) {
        noticias.removeIf(noticia -> noticia.getTitular().equals(titular));
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }
}

