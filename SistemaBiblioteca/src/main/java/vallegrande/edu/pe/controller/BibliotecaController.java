package vallegrande.edu.pe.controller;
import java.util.ArrayList;
import vallegrande.edu.pe.model.Libro;
public class BibliotecaController {


    //Lista donde almacenaremos nuestros libros

    private ArrayList<Libro> libros;

    //contrustor
    public BibliotecaController(){
        libros = new ArrayList<>();
    }

    //Registar
    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro Registrado Correctamente");
        return;
    }

    //Listar
    public void listarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros registrados");
            return;
        }
        System.out.println("LISTA DE LIBROS");
        for ( Libro libro: libros){
            libro.mostrarLibro();
        }
    }
    //Buscar
    public void buscarLibro(String criterio){
        boolean encontrado = false;
        String texto = criterio.toLowerCase();
        for ( Libro libro: libros){
            if(libro.getTitulo().toLowerCase().contains(texto) ||
                    libro.getAutor().toLowerCase().contains(texto)) {
                libro.mostrarLibro();
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontro ningun libro");
        }
    }

}