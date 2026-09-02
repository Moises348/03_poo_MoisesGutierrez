package vallegrande.edu.pe.miperfil;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vallegrande.edu.pe.miperfil.controller.PerfilController;
import vallegrande.edu.pe.miperfil.view.PerfilView;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        PerfilView view = new PerfilView();
        new PerfilController(view);

        // Se ajusta el tamaño a 420x480 para que quepa todo el diseño
        Scene scene = new Scene(
                view.getContenedor(),
                420,
                480
        );

        stage.setTitle("Mi Perfil - Gamer Edition");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}