import java.util.*;

public class GrafoComHash {
    private Map<String, Integer> cidadeParaIndice; // Mapeia cidade → índice
    private List<List<Integer>> grafo; // Lista de adjacência
    private int indiceAtual = 0;

    public GrafoComHash() {
        cidadeParaIndice = new HashMap<>();
        grafo = new ArrayList<>();
    }

    // Adiciona uma cidade ao grafo
    public void adicionarCidade(String cidade) {
        if (!cidadeParaIndice.containsKey(cidade)) {
            cidadeParaIndice.put(cidade, indiceAtual++);
            grafo.add(new ArrayList<>()); // Inicializa a lista de adjacência
        }
    }

    // Adiciona uma aresta entre duas cidades
    public void adicionarRota(String cidade1, String cidade2) {
        int indice1 = cidadeParaIndice.get(cidade1);
        int indice2 = cidadeParaIndice.get(cidade2);
        grafo.get(indice1).add(indice2);
        grafo.get(indice2).add(indice1); // Grafo não direcionado
    }

    // Retorna os vizinhos de uma cidade
    public List<String> getVizinhos(String cidade) {
        int indice = cidadeParaIndice.get(cidade);
        List<String> vizinhos = new ArrayList<>();
        for (int vizinhoIndice : grafo.get(indice)) {
            for (Map.Entry<String, Integer> entry : cidadeParaIndice.entrySet()) {
                if (entry.getValue() == vizinhoIndice) {
                    vizinhos.add(entry.getKey());
                    break;
                }
            }
        }
        return vizinhos;
    }

    public static void main(String[] args) {
        GrafoComHash grafo = new GrafoComHash();
        grafo.adicionarCidade("São Paulo");
        grafo.adicionarCidade("Rio de Janeiro");
        grafo.adicionarCidade("Belo Horizonte");

        grafo.adicionarRota("São Paulo", "Rio de Janeiro");
        grafo.adicionarRota("São Paulo", "Belo Horizonte");

        System.out.println("Vizinhos de São Paulo: " + grafo.getVizinhos("São Paulo"));
    }
}
