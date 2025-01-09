package Fundamentos.Arrays.Exerc02;

class Casa {
    String cor;
    Porta[] portas; // Array de portas
    int totalDePortas; // Contador para o total de portas

    public Casa(int capacidade) {
        this.portas = new Porta[capacidade]; // Inicializa o array de portas com o tamanho especificado
        this.totalDePortas = 0; // Inicializa o total de portas
    }

    // Método para pintar a casa
    void pinta(String cor) {
        this.cor = cor;
        System.out.println("A casa foi pintada de " + cor);
    }

    // Método para adicionar uma porta
    void adicionaPorta(Porta p) {
        if (totalDePortas < portas.length) {
            portas[totalDePortas] = p; // Adiciona a porta no próximo espaço livre
            totalDePortas++; // Atualiza o contador de portas
        } else {
            System.out.println("Não é possível adicionar mais portas, a casa está cheia.");
        }
    }

    // Método para contar quantas portas estão abertas
    int quantasPortasEstaoAbertas() {
        int abertas = 0;
        for (int i = 0; i < totalDePortas; i++) {
            if (portas[i].estaAberta()) {
                abertas++;
            }
        }
        return abertas;
    }

    // Método para obter o total de portas na casa
    int totalDePortas() {
        return totalDePortas;
    }
}
