package edu.craptocraft.barcos;


public class Portaaviones implements Barco {

    private int numeroAviones = 0;
    private int numeroMarinos = 0;

    public Portaaviones() {
        System.out.println("Se ha creado un nuevo : " + this);
    }

    public Portaaviones(int numeroAviones, int numeroMarinos) {
        this.numeroAviones = numeroAviones;
        this.numeroMarinos = numeroMarinos;
        System.out.println("Se ha creado un nuevo : " + this);
    }

    public void setNumeroAviones(int numeroAviones) {
        this.numeroAviones = numeroAviones;
    }

    public int getNumeroAviones() {
        return numeroAviones;
    }

    public int getNumeroMarinos() {
        return numeroMarinos;
    }

    public void setNumeroMarinos(int numeroMarinos) {
        this.numeroMarinos = numeroMarinos;
    }


    public static void alarma() {
        System.out.println("Soy un portaaviones");
    }

    @Override
    public void mensajeSocorro(String mensaje) {
        System.out.println(mensaje);
        alarma();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portaaviones{");
        sb.append("numeroAviones=").append(getNumeroAviones());
        sb.append(", numeroMarinos=").append(getNumeroMarinos());
        sb.append('}');
        return sb.toString();
    }
}
