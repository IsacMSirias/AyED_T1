package sample;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.DataOutputStream;
import java.io.IOException;

/**

 * Esta clase se define como el Conexion  {@link Cliente} em la cual se encuentra lo necesario para que funcionen los sockets

 */
public class Cliente extends Conexion
{

    /**

     * Esta clase se define como el cliente  {@link Cliente} , en ella se encuentran los y atributos que se van a utilizar para poder tener
     * una buena comunicacion entre los sockets.
     *@throws IOException Por si ocurre algun error el cual no se tomó en cuenta

     */
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion


    /**

     * Método que inicia la conexión del cliente.*
     * @throws IOException Por si ocurre algun problema que no se tomó en cuenta


     */
    public void startClient() throws IOException //Metodo para iniciar el cliente
    {


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


                  salidaServidor.writeUTF(String.valueOf(Peso)); // Se le envia al servidor el peso
                  salidaServidor.writeUTF(String.valueOf(Impuesto)); // Se le envia al servidor el impuesto
                  salidaServidor.writeUTF(String.valueOf(Precio)); // Se le envia al servidor el precio


              }

            //   cs.close();//Fin de la conexión
        }
    }
}