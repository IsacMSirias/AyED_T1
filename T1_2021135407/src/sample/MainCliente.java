package sample;


import java.io.IOException;




/**

 * Clase principal que hará uso del cliente
 */

public class MainCliente
{
    /**

     * Metodo que inicia la al cliente
     *  @param args  Los argumentos necesarios para poder correr la app
     *  @throws IOException Por so ocurre un error no esperado
     */
    public static void main(String[] args) throws IOException



    {

        Cliente cli = new Cliente(); //Se crea el cliente

        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente


    }

}
