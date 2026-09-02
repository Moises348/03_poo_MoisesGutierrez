package vallegrande.edu.pe.miperfil.controller;

import vallegrande.edu.pe.miperfil.model.Perfil;
import vallegrande.edu.pe.miperfil.view.PerfilView;

public class PerfilController {
    private PerfilView view;

    public PerfilController(PerfilView view) {
        this.view = view;
        view.getBtnConfirmar().setOnAction(e -> confirmarPerfil());
    }

    private void confirmarPerfil() {
        String nombre = view.getTxtNombre().getText().trim();
        String carrera = view.getTxtCarrera().getText().trim();
        String semestre = view.getTxtSemestre().getText().trim();
        String juegoFav = view.getTxtJuegoFav().getText().trim();

        // Validación del dato obligatorio
        if (juegoFav.isEmpty()) {
            view.getLblResultado().setText("⚠️ Debes ingresar qué juego juegas.");
            view.getLblResultado().setStyle("-fx-text-fill: #e74c3c; -fx-font-weight: bold;");
            return;
        }

        Perfil perfil = new Perfil(nombre, carrera, semestre, juegoFav);

        view.getLblResultado().setText(perfil.obtenerPresentacion());
        view.getLblResultado().setStyle("-fx-text-fill: #27ae60; -fx-font-weight: bold;");
    }
}