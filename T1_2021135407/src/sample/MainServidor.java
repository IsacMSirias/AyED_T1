package sample;


import java.io.IOException;




/**

 * Clase principal que hará uso del servidor {@link MainServidor}
 */
public class MainServidor



{

    /**

     * Este metodo iniciará al servidor.
     * @param args Los argumnentos necesarios para correr la App del Servidor
     * @throws IOException Por si ocurre un error que no se tenia en cuenta.
     */

    public static void main(String[] args) throws IOException
    {



        Servidor serv = new Servidor(); //Se crea el servidor

        System.out.println("Iniciando servidor\n");
        serv.startServer(); //Se inicia el servidor
    }
}