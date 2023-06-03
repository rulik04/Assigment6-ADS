import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data) {
        this.data = data;
    }

    public void addAdjacentVertices(Vertex<V> dest, double weight) {
        adjacentVertices.put(dest, weight);
    }

    public boolean containsDestination(Vertex<V> v) {
        return adjacentVertices.containsKey(v);
    }

    public Iterable<V> getAdjacent() {
        List<V> vertices;
        vertices = new LinkedList<>();
        for (var e : adjacentVertices.keySet()) {
            vertices.add(e.data);
        }
        return vertices;
    }

    public int countOfAdj(){
        return adjacentVertices.size();
    }

    public Double getWeight(Vertex<V> v){
        return adjacentVertices.get(v);
    }
}
