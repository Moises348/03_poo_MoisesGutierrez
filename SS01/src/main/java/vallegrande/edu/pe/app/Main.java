
package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.agendaController;
import vallegrande.edu.pe.model.Contacto;
import vallegrande.edu.pe.view.agendaView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        agendaView view = new agendaView();
        agendaController controller = new agendaController();
        Scanner scanner = new Scanner(System.in);

        // Carga mínima obligatoria de 5 contactos de prueba
        controller.agregarContacto(new Contacto(1, "Ana", "Torres", "Cañete", "983745656", "ana@gmail.com"));
        controller.agregarContacto(new Contacto(2, "Carlos", "Perez", "Imperial", "951264456", "carlos@gmail.com"));
        controller.agregarContacto(new Contacto(3, "Maria", "Gomez", "Lima", "912345678", "maria@gmail.com"));
        controller.agregarContacto(new Contacto(4, "Juan", "Alarcon", "San Vicente", "976543210", "juan@gmail.com"));
        controller.agregarContacto(new Contacto(5, "Lucia", "Torres", "Pisco", "945612378", "lucia@gmail.com"));

        int opcion = 0;
        int contadorId = 6; // Autoincrementable para nuevos registros

        do {
            view.mostrarMenu();
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- REGISTRAR CONTACTO ---");
                    System.out.print("Nombres: ");
                    String nombres = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Correo Electrónico: ");
                    String correo = scanner.nextLine();

                    Contacto nuevo = new Contacto(contadorId++, nombres, apellidos, direccion, telefono, correo);
                    controller.agregarContacto(nuevo);
                    break;

                case 2:
                    controller.listarContactos();
                    break;

                case 3:
                    System.out.print("\nIngrese el nombre o apellido a buscar: ");
                    String criterio = scanner.nextLine();
                    controller.buscarContacto(criterio);
                    break;

                case 4:
                    System.out.print("\nIngrese el ID del contacto a eliminar: ");
                    try {
                        int idEliminar = Integer.parseInt(scanner.nextLine());
                        if (controller.eliminarContacto(idEliminar)) {
                            System.out.println("-> Contacto eliminado correctamente.");
                        } else {
                            System.out.println("-> No se encontró ningún contacto con ese ID.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("-> ID invalido.");
                    }
                    break;

                case 5:
                    System.out.println("\n¡Gracias por usar la Agenda de Contactos!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}