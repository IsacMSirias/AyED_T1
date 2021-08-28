package sample;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.io.Writer;

class Calcular extends Sample {
    TextField TxBxPeso;
    TextField TxBxImpuesto;
    AnchorPane TxBxPrecio;
    int Total;
    int Peso = Integer.parseInt(this.TxBxPeso.getText());
    int Impuesto = Integer.parseInt(this.TxBxImpuesto.getText());
    int Precio = Integer.parseInt(this.TxBxPrecio.getAccessibleText());
    int res = Total;
    public void Calculo(int pr, int imp, int pe) throws IOException {

        this.Peso = pe;
        this.Impuesto = imp;
        this.Precio = pr;
        res = (int) ((pr * (imp / 100)) + (pe * 0.15));
        Total = res;
        //Se le envía un message al cliente usando su flujo de salida





    }
}