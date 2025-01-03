public class Main {
    public static void main (String[] args) {
        Funcionario funcionario = new Funcionario("João", 30, "Desenvolvedor");
        funcionario.apresentar();
    }
}
class Pessoa {
    private String nome;
    private int idade;

    //Construtor
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

class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade); // chama o construtor da superclasse
        this.cargo = cargo;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Eu sou: " + cargo + ".");
    }
}