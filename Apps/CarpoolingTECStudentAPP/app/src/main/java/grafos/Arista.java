package grafos;

public class Arista {
    private final String id;
    private final Vertice salida;
    private final Vertice llegada;
    private final int peso;

    public Arista(String id, Vertice salida, Vertice llegada, int peso) {
        this.id = id;
        this.salida = salida;
        this.llegada = llegada;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }
    public Vertice getDestination() {
        return llegada;
    }

    public Vertice getsalida() {
        return salida;
    }
    public int getpeso() {
        return peso;
    }

    @Override
    public String toString() {
        return salida + " " + llegada;
    }


}

