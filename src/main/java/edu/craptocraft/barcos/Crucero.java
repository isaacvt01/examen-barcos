package edu.craptocraft.barcos;

import edu.craptocraft.barcos.Barco;

public class Crucero implements Barco {

    private Double metrosEslora = 0d;

    static int numCamas = 0;

    public Crucero() {
        System.out.println(this);
    }

    public Crucero(Double metrosEslora) {
        this.metrosEslora = metrosEslora;
        System.out.println(this);
    }

    public static void alarma() {
        System.out.println("Soy un crucero");
    }

    @Override
    public void mensajeSocorro(String mensaje) {
        System.out.println(mensaje);
        alarma();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Se ha creado un nuevo crucero con:\n");
        sb.append("metros de eslora: ").append(metrosEslora + "\n");
        sb.append("Camas ocupadas: ").append(numCamas);
        return sb.toString();
    }


}
