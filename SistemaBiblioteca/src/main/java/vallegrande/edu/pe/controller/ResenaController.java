package vallegrande.edu.pe.controller;

import java.util.ArrayList;
import vallegrande.edu.pe.model.Resena;

public class ResenaController {

    private ArrayList<Resena> resenas;

    public ResenaController() {
        resenas = new ArrayList<>();
    }

    public void agregarResena(Resena resena) {
        resenas.add(resena);
        System.out.println("Reseña Registrada Correctamente");
    }

    public void listarResenas() {
        if (resenas.isEmpty()) {
            System.out.println("No hay reseñas registradas");
            return;
        }
        System.out.println("LISTA DE RESEÑAS");
        for (Resena resena : resenas) {
            resena.mostrarResena();
        }
    }
}