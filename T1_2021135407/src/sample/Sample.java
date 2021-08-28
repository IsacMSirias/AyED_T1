package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;

import java.io.IOException;


public class Sample {

    public TextField Total;
    @FXML
    int TxBxPeso;
    @FXML
    int TxBxImpuesto;
    @FXML
    int TxBxPrecio;
    @FXML
    Button BtnCalcular;

    public void btncalculoprice(ActionEvent actionEvent) throws IOException {

        int a = 0;
        this.TxBxPrecio = a;
        int b = 0;
        this.TxBxImpuesto = b;
        int c = 0;
        this.TxBxPrecio = c;

        Calcular calcular = new Calcular();
        calcular.Calculo(a, b, c);




    }
}
