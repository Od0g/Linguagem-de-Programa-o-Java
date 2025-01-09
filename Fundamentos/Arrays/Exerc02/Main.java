package Fundamentos.Arrays.Exerc02;

public class Main {
    public static void main(String[] args) {
        // Criando a casa com capacidade para 3 portas
        Casa minhaCasa = new Casa(3);
        
        // Pintando a casa
        minhaCasa.pinta("azul");

        // Criando portas
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();
        
        // Adicionando as portas à casa
        minhaCasa.adicionaPorta(porta1);
        minhaCasa.adicionaPorta(porta2);
        minhaCasa.adicionaPorta(porta3);

        // Abrindo algumas portas
        porta1.abrir();
        porta2.abrir();
        
        // Fechando a terceira porta
        porta3.fechar();
        
        // Imprimindo o número de portas abertas e o total de portas
        System.out.println("Número de portas abertas: " + minhaCasa.quantasPortasEstaoAbertas());
        System.out.println("Total de portas na casa: " + minhaCasa.totalDePortas());
    }
}
