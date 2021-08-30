
package sample;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Servidor extends Conexion //Se hereda de conexión para hacer uso de los sockets y demás
{
    public Servidor() throws IOException{super("servidor");} //Se usa el constructor para servidor de Conexion

    public void startServer()//Método para iniciar el servidor
    {
        try
        {
            System.out.println("Esperando..."); //Esperando conexión

            cs = ss.accept(); //Accept comienza el socket y espera una conexión desde un cliente

            System.out.println("Cliente en línea");



                    //Se obtiene el flujo de salida del cliente para enviarle mensajes
            salidaCliente = new DataOutputStream(cs.getOutputStream());
            //Se obtiene el flujo entrante desde el cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));

            salidaCliente.writeUTF(String.valueOf(Total)); //Le envia al cliente el valor de la operacion

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}


