package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.BibliotecaController;
import vallegrande.edu.pe.controller.ResenaController;
import vallegrande.edu.pe.model.Libro;
import vallegrande.edu.pe.model.Resena;
import vallegrande.edu.pe.view.BibliotecaView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BibliotecaController libroController = new BibliotecaController();
        ResenaController resenaController = new ResenaController();
        BibliotecaView view = new BibliotecaView();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        view.mostrarTitulo();

        do {
            view.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Título:");
                    String titulo = scanner.nextLine();
                    System.out.println("Autor:");
                    String autor = scanner.nextLine();
                    System.out.println("Año:");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    if (autor.trim().isEmpty() || titulo.trim().isEmpty() || anio <= 0) {
                        System.out.println("Datos no válidos. El autor o título no pueden estar vacíos.");
                    } else {
                        Libro libro = new Libro(id, titulo, autor, anio);
                        libroController.agregarLibro(libro);
                    }
                    break;

                case 2:
                    libroController.listarLibros();
                    break;

                case 3:
                    System.out.println("Ingrese Título o Autor:");
                    String criterio = scanner.nextLine();
                    libroController.buscarLibro(criterio);
                    break;

                case 4:
                    System.out.println("ID de la Reseña:");
                    int idResena = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Título:");
                    String tituloResena = scanner.nextLine();
                    System.out.println("Comentario:");
                    String comentario = scanner.nextLine();
                    System.out.println("Calificación (1 al 5):");
                    double calificacion = scanner.nextDouble();
                    scanner.nextLine();

                    if (tituloResena.trim().isEmpty() || comentario.trim().isEmpty() || calificacion < 1 || calificacion > 5) {
                        System.out.println("Datos no válidos para la reseña.");
                    } else {
                        Resena resena = new Resena(idResena, tituloResena, comentario, calificacion);
                        resenaController.agregarResena(resena);
                    }
                    break;

                case 5:
                    resenaController.listarResenas();
                    break;

                case 6:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 6);

        scanner.close();
    }
}