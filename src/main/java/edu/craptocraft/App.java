package edu.craptocraft;
import edu.craptocraft.barcos.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Se crean los barcos
        Barco crucero = new Crucero(23.00);
        crucero.mensajeSocorro("Holaaaa");
        System.out.println("--------------------------------------------------");
        Barco portaaviones = new Portaaviones(22, 22);
        portaaviones.mensajeSocorro("Portaavioneeeees");

        System.out.println("--------------------------------------------------");
        Barco pesquero = new Pesquero(11, 33.4, 4);
        pesquero.mensajeSocorro("Mensaje del pesquero");
        System.out.println("Crearlos sin constructor\n" +
                "-----------------------------------------------------------------");
        Barco cruceroVacio = new Crucero();
        Barco portaavionesVacio = new Portaaviones();
        Barco pesqueroVacio = new Pesquero();
    }
}
