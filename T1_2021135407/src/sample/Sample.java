package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;

import java.io.IOException;
/**

 * Clase Sample, esta clase Es la que tiene la informacion de los elementos presentes en el la intetface
 */

public class Sample {
    /**

     * TextBox en el cual en cliente recibirá el monto total
     */
    public TextField Total;

    @FXML
    int TxBxPeso;
    @FXML
    int TxBxImpuesto;
    @FXML
    int TxBxPrecio;
    @FXML
    Button BtnCalcular;

    /**

     * Metodo en el cual al precionar el boton de calcular, ejecutara el algoritmo que calcula el precio.
     *  @param actionEvent - Indica cuando se preciona el boton
     *  @throws IOException Por si ocurre algun error que no se tomó en cuenta


     */

    public void btncalculoprice(ActionEvent actionEvent) throws IOException {

        int a = 0;
        this.TxBxPrecio = a;
        int b = 0;
        this.TxBxImpuesto = b;
        int c = 0;
        this.TxBxPeso = c;

        Calcular calcular = new Calcular();
        calcular.Calculo(a, b, c);






    }


}

