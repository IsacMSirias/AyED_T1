package sample;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.DataOutputStream;
import java.io.IOException;


public class Cliente extends Conexion
{
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient() throws IOException //Método para iniciar el cliente
    {

            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            //Se enviarán dos mensajes

             class Enviar extends Sample{
                //Se escribe en el servidor usando su flujo de datos
                TextField TxBxPeso;
                TextField TxBxImpuesto;
                AnchorPane TxBxPrecio;
                TextField Total;

              public void Valores(ActionEvent actionEvent) throws IOException {

                  int Peso = Integer.parseInt(this.TxBxPeso.getText());
                  int Impuesto = Integer.parseInt(this.TxBxImpuesto.getText());
                  int Precio = Integer.parseInt(this.TxBxPrecio.getAccessibleText());


                  salidaServidor.writeUTF(String.valueOf(Peso));
                  salidaServidor.writeUTF(String.valueOf(Impuesto));
                  salidaServidor.writeUTF(String.valueOf(Precio));


              }

            //   cs.close();//Fin de la conexión
        }
    }
}