package edu.craptocraft.barcos;

import edu.craptocraft.barcos.Barco;

public class Pesquero implements Barco {

    private int metrosEslora = 0;

    private Double potencia = 0d;

    private int numPescadores = 0;
    public Pesquero() {
        System.out.println("Se ha creado: " + this);
    }
    public Pesquero(int metrosEslora, Double potencia, int numPescadores) {
        this.metrosEslora = metrosEslora;
        this.potencia = potencia;
        this.numPescadores = numPescadores;
        System.out.println("Se ha creado: " + this);
    }

    public static void alarma() {
        System.out.println("Soy un pesquero");
    }

    @Override
    public void mensajeSocorro(String mensaje) {
        System.out.println(mensaje);
        alarma();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pesquero{");
        sb.append("metrosEslora=").append(metrosEslora);
        sb.append(", potencia=").append(potencia);
        sb.append(", numPescadores=").append(numPescadores);
        sb.append('}');
        return sb.toString();
    }
}
