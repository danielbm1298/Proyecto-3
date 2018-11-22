package sistema;

public class Grafo {
    private final Linked_List<Vertice> vertices;
    private final Linked_List<Arista> aristas;

    public Grafo(Linked_List<Vertice> vertices, Linked_List<Arista> aristas) {
        this.vertices = vertices;
        this.aristas = aristas;
    }

    public Linked_List<Vertice> getVertexes() {
        return vertices;
    }

    public Linked_List<Arista> getEdges() {
        return aristas;
    }
	
}
