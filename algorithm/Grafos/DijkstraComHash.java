import java.util.*;

public class DijkstraComHash {
    private Map<String, Integer> cidadeParaIndice;
    private List<List<int[]>> grafo; // Lista de adjacência com pesos
    private int indiceAtual = 0;

    public DijkstraComHash() {
        cidadeParaIndice = new HashMap<>();
        grafo = new ArrayList<>();
    }

    public void adicionarCidade(String cidade) {
        if (!cidadeParaIndice.containsKey(cidade)) {
            cidadeParaIndice.put(cidade, indiceAtual++);
            grafo.add(new ArrayList<>());
        }
    }

    public void adicionarRota(String cidade1, String cidade2, int peso) {
        int indice1 = cidadeParaIndice.get(cidade1);
        int indice2 = cidadeParaIndice.get(cidade2);
        grafo.get(indice1).add(new int[] { indice2, peso });
        grafo.get(indice2).add(new int[] { indice1, peso }); // Grafo não direcionado
    }

    public Map<String, Integer> dijkstra(String inicio) {
        int inicioIndice = cidadeParaIndice.get(inicio);
        int n = grafo.size();
        int[] distancias = new int[n];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[inicioIndice] = 0;

        PriorityQueue<int[]> fila = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        fila.add(new int[] { inicioIndice, 0 });

        while (!fila.isEmpty()) {
            int[] atual = fila.poll();
            int vertice = atual[0], distancia = atual[1];

            if (distancia > distancias[vertice])
                continue;

            for (int[] vizinho : grafo.get(vertice)) {
                int novaDistancia = distancia + vizinho[1];
                if (novaDistancia < distancias[vizinho[0]]) {
                    distancias[vizinho[0]] = novaDistancia;
                    fila.add(new int[] { vizinho[0], novaDistancia });
                }
            }
        }

        // Converte distâncias de volta para nomes das cidades
        Map<String, Integer> resultado = new HashMap<>();
        for (Map.Entry<String, Integer> entry : cidadeParaIndice.entrySet()) {
            resultado.put(entry.getKey(), distancias[entry.getValue()]);
        }
        return resultado;
    }

    public static void main(String[] args) {
        DijkstraComHash grafo = new DijkstraComHash();
        grafo.adicionarCidade("São Paulo");
        grafo.adicionarCidade("Rio de Janeiro");
        grafo.adicionarCidade("Belo Horizonte");

        grafo.adicionarRota("São Paulo", "Rio de Janeiro", 400);
        grafo.adicionarRota("São Paulo", "Belo Horizonte", 600);

        Map<String, Integer> distancias = grafo.dijkstra("São Paulo");
        System.out.println("Distâncias: " + distancias);
    }
}
