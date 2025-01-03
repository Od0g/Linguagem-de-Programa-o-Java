package Exemplo01;
public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade); // chama o construtor da superclasse
        this.cargo = cargo;
    }

    @Override
    public void apresentar() { 
        super.apresentar();
        System.out.println("Cargo: " + cargo);
    }
}
