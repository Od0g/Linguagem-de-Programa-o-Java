package Exemplo01;
public class Pessoa {
    private String nome;
    private int idade;

// Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

// Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Oi, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}