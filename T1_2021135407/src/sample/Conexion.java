package sample;

//Se importan las bibliotecas de javaFX que se van a utilizar para la confeccion de la clase
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**

 * Esta clase se define como el Conexion  {@link Conexion}, en ella se encuentran todos los metodos requeridos para establecer la conexion entre
 * los dos sockets
 */

public class Conexion extends Sample
{
    /**

     * Se hace un los constructores de en donde se van a dar el flujo de datos entre los puertos de conexion
     */


    private final int PUERTO = 8070; //Puerto para la conexión
    private final String HOST = "localhost"; //Host para la conexión

    /**

     @deprecated Socket del servidor

     */
    protected ServerSocket ss;

    /**

     @deprecated Socket del servidor

     */


    protected Socket cs;

    /**

     @deprecated Se maneja la entrada y la salida de datos de los sockets entre el cliente y el servidor

     */
    protected DataOutputStream salidaServidor, salidaCliente;

    /**

    * @deprecated Flijo de salida de datos entre los dos sockets
     *@param tipo Dice cual es el tipo de conexion
     *@throws IOException Por si ocurre algun error
     */

    public Conexion(String tipo) throws IOException //Constructor
    {
        if(tipo.equalsIgnoreCase("servidor"))
        {
            ss = new ServerSocket(PUERTO);//Se crea el socket para el servidor en puerto 1234
            cs = new Socket(); //Socket para el cliente
        }
        else
        {
            cs = new Socket(HOST, PUERTO); //Socket para el cliente en localhost en puerto 1234
        }
    }
}
