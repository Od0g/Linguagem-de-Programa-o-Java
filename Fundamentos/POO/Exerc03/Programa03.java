package Exerc03;

public class Programa03 {
    public static void main(String[] args) {
        // Criando uma casa e pintando-a
        Casa casa = new Casa();
        casa.pinta("Azul");

        // Criando e configurando as portas da casa
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();

        casa.porta1 = porta1;
        casa.porta2 = porta2;
        casa.porta3 = porta3;

        //Abrindo e fechando as portas

        porta1.abre();
        porta2.fecha();
        porta3.abre();

        // Exibindo o número de portas abertas
        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
    }
}

class Casa {
    //Atributos 
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    // Métodos para pintar a casa
    void pinta(String s) {
        this.cor = s;
        System.out.println("A casa foi pintada de " + s + ".");
    }

    //Método para contar as portas abertas 
    int quantasPortasEstaoAbertas() {
        int abertas = 0;

        if (porta1 != null && porta1.estaAberta()) abertas++;
        if (porta2 != null && porta2.estaAberta()) abertas++;
        if (porta3 != null && porta3.estaAberta()) abertas++;

        return abertas;
    }
}

class Porta { 
    //Atributos 
    boolean abertas;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    //Método para abrir a porta 
    void abre() {
        this.abertas = true;
    }

    // Método para fechar a porta 
    void fecha() {
        this.abertas = false;
    }

    //Método para verifica se a porta está aberta
    boolean estaAberta() {
        return this.abertas;
    }
}
