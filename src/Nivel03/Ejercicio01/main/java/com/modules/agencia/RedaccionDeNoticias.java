package Nivel03.Ejercicio01.main.java.com.modules.agencia;

import Nivel03.Ejercicio01.main.java.com.modules.noticia.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RedaccionDeNoticias {
    private static Map<String, Redactor> redactores = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menú:");
            System.out.println("1.- Introducir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introducir noticia a un redactor.");
            System.out.println("4.- Eliminar noticia.");
            System.out.println("5.- Mostrar todas las noticias por redactor.");
            System.out.println("6.- Calcular puntuación de la noticia.");
            System.out.println("7.- Calcular precio-noticia.");
            System.out.println("8.- Salir.");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del redactor: ");
                    String nombre = scanner.nextLine();
                    System.out.print("DNI del redactor: ");
                    String dni = scanner.nextLine();
                    redactores.put(dni, new Redactor(nombre, dni));
                    System.out.println("Redactor añadido.");
                    break;

                case 2:
                    System.out.print("DNI del redactor a eliminar: ");
                    dni = scanner.nextLine();
                    redactores.remove(dni);
                    System.out.println("Redactor eliminado.");
                    break;

                case 3:
                    System.out.print("DNI del redactor: ");
                    dni = scanner.nextLine();
                    Redactor redactor = redactores.get(dni);
                    if (redactor != null) {
                        System.out.print("Deporte de la noticia (futbol, baloncesto, tenis, F1, motociclismo): ");
                        String deporte = scanner.nextLine();
                        System.out.print("Titular de la noticia: ");
                        String titular = scanner.nextLine();

                        Noticia noticia = null;
                        switch (deporte.toLowerCase()) {
                            case "futbol":
                                System.out.print("Competición: ");
                                String competicion = scanner.nextLine();
                                System.out.print("Club: ");
                                String club = scanner.nextLine();
                                System.out.print("Jugador: ");
                                String jugador = scanner.nextLine();
                                noticia = new NoticiaFutbol(titular, competicion, club, jugador);
                                break;
                            case "baloncesto":
                                System.out.print("Competición: ");
                                competicion = scanner.nextLine();
                                System.out.print("Club: ");
                                club = scanner.nextLine();
                                noticia = new NoticiaBaloncesto(titular, competicion, club);
                                break;
                            case "tenis":
                                System.out.print("Competición: ");
                                competicion = scanner.nextLine();
                                System.out.print("Tenista: ");
                                String tenista = scanner.nextLine();
                                noticia = new NoticiaTenis(titular, competicion, tenista);
                                break;
                            case "f1":
                                System.out.print("Escudería: ");
                                String escuderia = scanner.nextLine();
                                noticia = new NoticiaF1(titular, escuderia);
                                break;
                            case "motociclismo":
                                System.out.print("Equipo: ");
                                String equipo = scanner.nextLine();
                                noticia = new NoticiaMotociclismo(titular, equipo);
                                break;
                            default:
                                System.out.println("Deporte no válido.");
                                break;
                        }

                        if (noticia != null) {
                            redactor.agregarNoticia(noticia);
                            System.out.println("Noticia añadida.");
                        }
                    } else {
                        System.out.println("Redactor no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("DNI del redactor: ");
                    dni = scanner.nextLine();
                    redactor = redactores.get(dni);
                    if (redactor != null) {
                        System.out.print("Titular de la noticia a eliminar: ");
                        String titular = scanner.nextLine();
                        redactor.eliminarNoticia(titular);
                        System.out.println("Noticia eliminada.");
                    } else {
                        System.out.println("Redactor no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("DNI del redactor: ");
                    dni = scanner.nextLine();
                    redactor = redactores.get(dni);
                    if (redactor != null) {
                        for (Noticia noticia : redactor.getNoticias()) {
                            System.out.println("Titular: " + noticia.getTitular());
                            System.out.println("Puntuación: " + noticia.getPuntuacion());
                            System.out.println("Precio: " + noticia.getPrecio());
                            System.out.println();
                        }
                    } else {
                        System.out.println("Redactor no encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("DNI del redactor: ");
                    dni = scanner.nextLine();
                    redactor = redactores.get(dni);
                    if (redactor != null) {
                        System.out.print("Titular de la noticia: ");
                        String titular = scanner.nextLine();
                        for (Noticia noticia : redactor.getNoticias()) {
                            if (noticia.getTitular().equals(titular)) {
                                System.out.println("Puntuación de la noticia: " + noticia.getPuntuacion());
                                break;
                            }
                        }
                    } else {
                        System.out.println("Redactor no encontrado.");
                    }
                    break;

                case 7:
                    System.out.print("DNI del redactor: ");
                    dni = scanner.nextLine();
                    redactor = redactores.get(dni);
                    if (redactor != null) {
                        System.out.print("Titular de la noticia: ");
                        String titular = scanner.nextLine();
                        for (Noticia noticia : redactor.getNoticias()) {
                            if (noticia.getTitular().equals(titular)) {
                                System.out.println("Precio de la noticia: " + noticia.getPrecio());
                                break;
                            }
                        }
                    } else {
                        System.out.println("Redactor no encontrado.");
                    }
                    break;

                case 8:
                    running = false;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }
}
