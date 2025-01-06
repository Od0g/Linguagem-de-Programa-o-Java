package Exerc02;

public class Programa02 {
    public static void main(String[] args) {
        // Criando uma instância da classe Porta
        Porta porta = new Porta();

        //Alterando dimensões da porta
        porta.dimnesaoX = 2.1;
        porta.dimnesaoY = 0.9;
        porta.dimnesaoZ = 0.05;

        //Exibindo estado inicial da porta 
        System.out.println("Estado inicial:");
        porta.mostraEstado();

        //Abrindo e fechando a porta
        porta.abre();
        System.out.println("Depois de abrir a porta: ");
        porta.mostraEstado();

        porta.fecha();
        System.out.println("Depois de fechar a porta: ");
        porta.mostraEstado();

        // Pintando a porta de diferentes cores
        porta.pinta("vermelho");
        porta.pinta("azul");
        porta.pinta("amarelo");

        // Verificando se a porta está aberta
        System.out.println("A porta está aberta? " + porta.estaAberta());

    }
}

class Porta {
    //Atributos
    boolean aberta;
    String cor;
    double dimnesaoX;
    double dimnesaoY;
    double dimnesaoZ;

    // Método para abrir a porta 
    void abre() {
        this.aberta = true;
    }

    void fecha() {
        this.aberta = false;
    }

    void pinta(String s) {
        this.cor = s;
        System.out.println("A porta foi pintada de " + s + ".");
    }

    // Método para verificar se a porta está aberta
    boolean estaAberta() {
        return this.aberta;
    }

    // Método para exibir o estado da porta
    void mostraEstado() {
        System.out.println("A porta está aberta? " + (aberta ? "Sim" : "Não"));
        System.out.println("Cor da porta: " + (cor != null ? cor : "Sem cor"));
        System.out.println("Dimensões (X x Y x Z): " + dimnesaoX + "x" + dimnesaoY + "x" +dimnesaoZ);
    }
}
