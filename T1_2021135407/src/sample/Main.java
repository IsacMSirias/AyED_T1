package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

/**

 * Esta clase es la es la que corre la interface del programa
 */

public class Main extends Application {

    @Override


    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        primaryStage.setTitle("App");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    /**

     * Este metodo incia la interfas
     * @param args son los argumentos que se necesita para correr la app.
     */

    public static void main(String[] args) {

        launch(args);
    }
}
