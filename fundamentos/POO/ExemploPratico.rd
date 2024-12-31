    
Aplicação prática: Exemplo completo

    "public class Pessoa {
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

    public class Funcionario extends Pessoa {
        private String cargo;

        public Funcionario(String nome, int idade, String cargo) {
            super(nome, idade); // Chama o construtor da classe Pessoa
            this.cargo = cargo;
        }

        @Override
        public void apresentar() {
            super.apresentar();
            System.out.println("Eu sou " + cargo + ".");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Funcionario funcionario = new Funcionario("João", 30, "Desenvolvedor");
            funcionario.apresentar();
        }
    }

    Saída:
        Oi, meu nome é João e tenho 30 anos.
        Eu sou Desenvolvedor.";

O código apresentado é quase perfeito, mas há um erro relacionado à estrutura de um arquivo Java . Em Java, só pode haver uma classe pública por arquivo, e o nome do arquivo deve corresponder ao nome dessa classe pública .

Neste código foi declarado três classes publica: Pessoa, Funcionario, e Main. Isso viola as regras de organização de arquivos Java.

A correção foi feita nas pastas Exemplo01 e @Exemplo02

    

