class Porta {
    boolean aberta;

    void abrir() {
        this.aberta = true;
    }

    void fechar() {
        this.aberta = false;
    }

    boolean estaAberta() {
        return this.aberta;
    }
}

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

public class Main {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa(3);

        minhaCasa.pinta("azul");

        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();

        minhaCasa.adicionaPorta(porta1);
        minhaCasa.adicionaPorta(porta2);
        minhaCasa.adicionaPorta(porta3);

        porta1.abrir();
        porta2.abrir();

        System.out.println("Número de portas abertas: " + minhaCasa.quantasPortasEstaoAbertas());
        System.out.println("Total de portas na casa: " + minhaCasa.totalDePortas());
    }
}
