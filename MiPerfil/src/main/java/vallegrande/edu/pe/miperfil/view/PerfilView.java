package vallegrande.edu.pe.miperfil.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class PerfilView {
    private VBox contenedor;
    private Label titulo;
    private TextField txtNombre;
    private TextField txtCarrera;
    private TextField txtSemestre;
    private TextField txtJuegoFav; // Nuevo campo en la UI
    private Button btnConfirmar;
    private Label lblResultado;

    public PerfilView() {
        titulo = new Label("REGISTRO DE PERFIL");
        titulo.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: #2c3e50;");

        txtNombre = crearCampoTexto("Ingrese su nombre");
        txtCarrera = crearCampoTexto("Ingrese su carrera");
        txtSemestre = crearCampoTexto("Ingrese su semestre");
        txtJuegoFav = crearCampoTexto("¿Qué juego juegas? (Obligatorio)");

        btnConfirmar = new Button("Confirmar Perfil");
        btnConfirmar.setStyle(
                "-fx-background-color: #3498db; " +
                        "-fx-text-fill: white; " +
                        "-fx-font-size: 14px; " +
                        "-fx-font-weight: bold; " +
                        "-fx-padding: 8 20 8 20; " +
                        "-fx-background-radius: 5;"
        );

        btnConfirmar.setOnMouseEntered(e -> btnConfirmar.setStyle("-fx-background-color: #2980b9; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 8 20 8 20; -fx-background-radius: 5;"));
        btnConfirmar.setOnMouseExited(e -> btnConfirmar.setStyle("-fx-background-color: #3498db; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 8 20 8 20; -fx-background-radius: 5;"));

        lblResultado = new Label();
        lblResultado.setStyle("-fx-font-size: 13px; -fx-text-alignment: center;");

        contenedor = new VBox(12);
        contenedor.setPadding(new Insets(25));
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setStyle("-fx-background-color: #f8f9fa; -fx-border-color: #bdc3c7; -fx-border-width: 1; -fx-border-radius: 8; -fx-background-radius: 8;");

        contenedor.getChildren().addAll(
                titulo,
                txtNombre,
                txtCarrera,
                txtSemestre,
                txtJuegoFav,
                btnConfirmar,
                lblResultado
        );
    }

    private TextField crearCampoTexto(String prompt) {
        TextField tf = new TextField();
        tf.setPromptText(prompt);
        tf.setStyle("-fx-padding: 8px; -fx-border-color: #cccccc; -fx-border-radius: 4; -fx-background-radius: 4;");
        return tf;
    }

    public VBox getContenedor() { return contenedor; }
    public TextField getTxtNombre() { return txtNombre; }
    public TextField getTxtCarrera() { return txtCarrera; }
    public TextField getTxtSemestre() { return txtSemestre; }
    public TextField getTxtJuegoFav() { return txtJuegoFav; }
    public Button getBtnConfirmar() { return btnConfirmar; }
    public Label getLblResultado() { return lblResultado; }
}