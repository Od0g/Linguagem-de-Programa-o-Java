
import java.util.PriorityQueue;


public class Dijskstra {
    public int[] dijkstra(List<List<int[]>> grafo, int inicio) {
        // grafo.get(1) retorna pares [vizinho,  peso]
        int n = grafo.size();
        int[] distancias = new int[n];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[inicio] = 0;

        PriorityQueue<int[]> fila = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        fila.add(new int[]{inicio, 0});

        while (!fila.isEmpty()) {
            int[] atual = fila.poll();
            int vertice= atual[0], distancia = atual[1];

            if (distancia > distancias[vertice]) continue;

            for (int[] vizinho : grafo.get(vertice)) {
                int novoDistancia = distancia + vizinho[1];
                if (novoDistancia < distancias[vizinho[0]]) {
                    distancias[vizinho[0]] = novoDistancia;
                    fila.add(new int[]{vizinho[0], novoDistancia});
                }
            }
        }

        return distancias;
    }
}

 

