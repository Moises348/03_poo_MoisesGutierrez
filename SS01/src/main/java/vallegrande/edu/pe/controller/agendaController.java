package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Contacto;
import java.util.ArrayList;

public class agendaController {

    private ArrayList<Contacto> contactos;

    public agendaController() {
        contactos = new ArrayList<>();
    }

    // 1. Registrar
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("-> Contacto registrado con exito.");
    }

    // 2. Listar
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda esta vacia.");
            return;
        }
        System.out.println("\n=== LISTA DE CONTACTOS ===");
        for (Contacto c : contactos) {
            c.mostrarContacto();
            System.out.println("---------------------------");
        }
    }

    // 2. Buscar por nombre o apellido (coincidencia parcial o exacta)
    public void buscarContacto(String criterio) {
        boolean encontrado = false;
        String busqueda = criterio.toLowerCase();

        System.out.println("\n=== RESULTADOS DE BÚSQUEDA ===");
        for (Contacto c : contactos) {
            if (c.getNombres().toLowerCase().contains(busqueda) ||
                    c.getApellidos().toLowerCase().contains(busqueda)) {
                c.mostrarContacto();
                System.out.println("---------------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron contactos con el criterio: " + criterio);
        }
    }

    // 3. Eliminar contacto por ID
    public boolean eliminarContacto(int id) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getId() == id) {
                contactos.remove(i);
                return true;
            }
        }
        return false;
    }
}