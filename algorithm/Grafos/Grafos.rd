Grafos
    Um grafo é uma estrutura composta por:

        Vértices (nós):
            Representam entidades
                (ex: cidades, usuários).

        Arestas (arcos):
            Representam conexões entre vértices
                (ex: estradas, amizades).

    Tipos de Grafos:

        Não direcionado:
            Arestas não têm direção
                (ex: amizade no Facebook).

        Direcionado:
            Arestas têm direção
                (ex: seguir no Instagram).

        Ponderado:
            Arestas têm pesos
                (ex: distância entre cidades).


Grafos em java usa duas formas 

    matriz adjacente 

    usa uma matriz 2d  onde matriz[i][j] indica se há aresta entre i e j

        int [][] grafo = new int[n][n];

        //Exemplo: grafo não direcionado
        grafo[0][1]= 1; // Aresta  entre 0 e 1 
        grafo[1][0]= 1; // Bidimensional

    ou usa um lista de adjacência
        usa uma lista (geralmente um arrays de listas) para armazenar os vizinhos de cada vérice

        List<List<Integer>> grafo = new ArrayList<>();

        //  Inicializa as listas
        for (int i =0; i < n; i++) {
            grafo.add(new ArrayList<>());
        }

        // Adiciona aresta entre 0 e 1 (grafo não direcionado)
        grafo.get(0).add(1);
        grafo.get(1).add(0);
      
4. Aplicações Práticas
    Redes sociais
        (amizades).

    Sistemas de navegação
        (rotas mais curtas).

    Recomendações
        (conexões entre produtos).
        
    Detecção de ciclos em dependências
        (ex: build systems).     