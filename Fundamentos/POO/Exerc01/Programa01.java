package Exerc01;

public class Programa01 {
    public static void main(String[] args) {
        // Criando um instâcia para classe Pessoa
        Pessoa pessoa = new Pessoa("João",25);

        //Exibindo o estado inicial
        System.out.println("Estado inicial");
        pessoa.imprimeDados();

        // Fazendo a pessoa comemorar aniversários
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        //Exibindo o estado final
        System.out.println("Depois de alguns aniversários: ");
        pessoa.imprimeDados();
    }
    
}

class Pessoa {
    //Atributos
    private String nome;
    private int idade;

    //Construtor 
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Método que aumenta a idade
    public void fazAniversario() {
        this.idade++;

    }

    //Método para exibir o nome e a idade
    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
