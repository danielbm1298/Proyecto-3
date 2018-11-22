package sistema;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Dijkstra {
    private final Linked_List<Vertice> nodos;
    private final Linked_List<Arista> aristas;
    private Set<Vertice> settledNodes;
    private Set<Vertice> unSettledNodes;
    private Map<Vertice, Vertice> predecessors;
    private Map<Vertice, Integer> distance;

    public Dijkstra(Grafo graph) {
        // create a copy of the array so that we can operate on this array
        this.nodos = graph.getVertexes();
        this.aristas = graph.getEdges();
    }

    public void execute(Vertice source) {
        settledNodes = new HashSet<Vertice>();
        unSettledNodes = new HashSet<Vertice>();
        distance = new HashMap<Vertice, Integer>();
        predecessors = new HashMap<Vertice, Vertice>();
        distance.put(source, 0);
        unSettledNodes.add(source);
        while (unSettledNodes.size() > 0) {
        	Vertice node = getMinimum(unSettledNodes);
            settledNodes.add(node);
            unSettledNodes.remove(node);
            findMinimalDistances(node);
        }
    }

    private void findMinimalDistances(Vertice node) {
        Linked_List<Vertice> adjacentNodes = getNeighbors(node);
     
        for (int i=0; i<adjacentNodes.getLenght(); i++) {
        	Vertice target=adjacentNodes.getNode(i).getData();
            if (getShortestDistance(target) > getShortestDistance(node)
                    + getDistance(node, target)) {
                distance.put(target, getShortestDistance(node)
                        + getDistance(node, target));
                predecessors.put(target, node);
                unSettledNodes.add(target);
            }
        }

    }

    public int getDistance(Vertice node, Vertice target) {
        for (int i=0; i<aristas.getLenght(); i++) {
        	Arista edge=aristas.getNode(i).getData();
            if (edge.getsalida().equals(node)
                    && edge.getDestination().equals(target)) {
                return edge.getpeso();
            }
        }
        throw new RuntimeException("Should not happen");
    }

    private Linked_List<Vertice> getNeighbors(Vertice node) {
    	Linked_List<Vertice> neighbors = new Linked_List<Vertice>();
        for (int i=0; i<aristas.getLenght(); i++) {
        	Arista edge=aristas.getNode(i).getData();
            if (edge.getsalida().equals(node)
                    && !isSettled(edge.getDestination())) {
                neighbors.append(edge.getDestination());
            }
        }
        return neighbors;
    }

    private Vertice getMinimum(Set<Vertice> vertexes) {
    	Vertice minimum = null;
        for (Vertice vertex : vertexes) {
            if (minimum == null) {
                minimum = vertex;
            } else {
                if (getShortestDistance(vertex) < getShortestDistance(minimum)) {
                    minimum = vertex;
                }
            }
        }
        return minimum;
    }

    private boolean isSettled(Vertice vertex) {
        return settledNodes.contains(vertex);
    }

    private int getShortestDistance(Vertice destination) {
        Integer d = distance.get(destination);
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }

    /*
     * This method returns the path from the source to the selected target and
     * NULL if no path exists
     */
    public Linked_List<Vertice> getPath(Vertice target) {
        Linked_List<Vertice> path = new Linked_List<Vertice>();
        Vertice step = target;
        // check if a path exists
        if (predecessors.get(step) == null) {
            return null;
        }
        path.append(step);
        while (predecessors.get(step) != null) {
            step = predecessors.get(step);
            path.append(step);
        }
        // Put it into the correct order
        path=path.reverse(path);
        return path;
    }
    public int DistanciaTotal(Linked_List<Vertice> lista,Dijkstra dijkstra) {
		int distancia = 0;

    	for (int i=0; i<lista.getLenght()-1; i++) {
			distancia+=dijkstra.getDistance(lista.getNode(i).getData(),lista.getNode(i+1).getData());
    	}
    	return distancia;
    	
    }
}
