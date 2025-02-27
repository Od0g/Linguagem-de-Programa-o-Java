Algoritmo de busca em profundidade (DFS) em grafos.
usado para explorar todos os vértices ou detectar ciclos em um grafo.

public class DFS {
    public void dfs(List<List<Integer>> grafo, int vertice, boolean[] visitado) {
        visitado[vertice] = true;
        System.out.print(vertice + " ");

        for (int vizinho : grafo.get(vertice)) {
            if (!visitado[vizinho]) {
                dfs(grafo, vizinho, visitado);
            }
        }
    }
    
}
