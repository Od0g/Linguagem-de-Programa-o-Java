Algorithm: Breadth First Search (BFS) 
Algoritimo de Busca Em Largura para encontrar
caminho mais curtos em grafos NÃO PONDERADOS

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public void bfs(List<List<Integer>> grafo, int inicio) {
    Queue<Integer> fila = new LinkedList<>();
    boolean[] visitado = new boolean[grafo.size()];

    fila.add(inicio);
    visitado[inicio] = true;

    while (!fila.isEmpty()) {
        int vertice = fila.poll();
        System.out.print(vertice + " ");

        for (int vizinho : grafo.get(vertice)) {
            if (!visitado[vizinho]) {
                visitado[vizinho] = true;
                fila.add(vizinho);
            }
        }
    }
}