package sample;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.io.Writer;

class Calcular extends Sample { //Se hace una clase con un constructor para poder calcular el monto enviado
    //Se instancian los atributos que tiene la clase, las cuales serviran para
    TextField TxBxPeso;
    TextField TxBxImpuesto;
    AnchorPane TxBxPrecio;
    int Total;
    int Peso = Integer.parseInt(this.TxBxPeso.getText()); // Se obtiene el peso de lo que puso el usuario
    int Impuesto = Integer.parseInt(this.TxBxImpuesto.getText()); // Se obtiene el el impuesto que ingresó el usuario
    int Precio = Integer.parseInt(this.TxBxPrecio.getAccessibleText());// Se obtiene el precio de lo que ingresó el usuario
    int res = Total; // Se iguala la variale resultado a el total que aprece en pantalla
    public void Calculo(int pr, int imp, int pe) throws IOException { //Se crea la funcion que realizará el calculo de los valores

        this.Peso = pe;
        this.Impuesto = imp;
        this.Precio = pr;
        res = (int) ((pr * (imp / 100)) + (pe * 0.15));
        Total = res; // Se sustituye el total por la variable que obtiene el monto calculado
        //Se le envía un message al cliente usando su flujo de salida





    }
}