import java.util.*;

public class BellmanFord {
    static class Aresta {
        int origem, destino, peso;

        Aresta(int origem, int destino, int peso) {
            this.origem = origem;
            this.destino = destino;
            this.peso = peso;
        }
    }

    public static int[] calcularBellmanFord(List<Aresta> arestas, int numVertices, int origem) {
        int[] distancias = new int[numVertices];
        // Corrção
        java.util.Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[origem] = 0;

        // Relaxamento das arestas (V-1 vezes)
        for (int i = 0; i < numVertices - 1; i++) {
            for (Aresta aresta : arestas) {
                if (distancias[aresta.origem] != Integer.MAX_VALUE
                        && distancias[aresta.destino] > distancias[aresta.origem] + aresta.peso) {
                    distancias[aresta.destino] = distancias[aresta.origem] + aresta.peso;
                }
            }
        }

        // Verifica ciclos negativos
        for (Aresta aresta : arestas) {
            if (distancias[aresta.origem] != Integer.MAX_VALUE
                    && distancias[aresta.destino] > distancias[aresta.origem] + aresta.peso) {
                System.out.println("Ciclo negativo detectado!");
                return null;
            }
        }

        return distancias;
    }

    public static void main(String[] args) {
        List<Aresta> arestas = new ArrayList<>();
        arestas.add(new Aresta(0, 1, 4)); // Aresta de 0 → 1 com peso 4
        arestas.add(new Aresta(0, 2, 5)); // Aresta de 0 → 2 com peso 5
        arestas.add(new Aresta(1, 2, -3)); // Aresta de 1 → 2 com peso -3
        arestas.add(new Aresta(2, 3, 2)); // Aresta de 2 → 3 com peso 2

        int[] distancias = calcularBellmanFord(arestas, 4, 0);

        if (distancias != null) {
            System.out.println("Distâncias a partir do vértice 0:");
            for (int i = 0; i < distancias.length; i++) {
                System.out.println("Vértice " + i + ": " + distancias[i]);
            }
        }
    }
}
