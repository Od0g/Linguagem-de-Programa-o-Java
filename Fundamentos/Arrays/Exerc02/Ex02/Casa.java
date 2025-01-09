package Fundamentos.Arrays.Exerc02.Ex02;

class Casa {
    String cor;
    Porta[] portas;
    int totalDePortas;

    public Casa(int capacidade) {
        this.portas = new Porta[capacidade];
        this.totalDePortas = 0;
    }

    void pinta(String cor) {
        this.cor = cor;
        System.out.println("A casa foi pintada de " + cor);
    }

    void adicionaPorta(Porta p) {
        if (totalDePortas < portas.length) {
            portas[totalDePortas] = p;
            totalDePortas++;
        } else {
            System.out.println("Não é possível adicionar mais portas.");
        }
    }

    int quantasPortasEstaoAbertas() {
        int abertas = 0;
        for (int i = 0; i < totalDePortas; i++) {
            if (portas[i].estaAberta()) {
                abertas++;
            }
        }
        return abertas;
    }

    int totalDePortas() {
        return totalDePortas;
    }
}
