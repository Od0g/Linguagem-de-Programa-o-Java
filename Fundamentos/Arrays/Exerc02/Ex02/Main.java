package Fundamentos.Arrays.Exerc02.Ex02;

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
