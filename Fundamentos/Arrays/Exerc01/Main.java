class Empresa {
    String nome;
    String cnpj;
    Funcionario[] funcionarios;
    int contador; // Para indicar a próxima posição vazia do array

    public Empresa(int capacidade) {
        this.funcionarios = new Funcionario[capacidade];
        this.contador = 0;
    }
    void adiciona(Funcionario f) {
        if (contador < funcionarios.length) {
            funcionarios[contador] = f;
            contador++;
        } else {
            System.out.println("A array de funcionarios está cheia!");
        }
    }
    
    void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                System.out.println("Nome: " + funcionario.nome + ", Salario: " + funcionario.salario);
            }
        }
    }

    boolean contem(Funcionario f) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario == f) {
                return true;
            }

        }
        return false;
    }


    void realocarFuncionarios() {
        Funcionario[] novaArray= new Funcionario[funcionarios.length * 2];
        for (int i = 0; i < funcionarios.length; i++) {
            novaArray[i] = funcionarios[i];
        }
        funcionarios = novaArray;
    }
}

class Funcionario {
    String nome;
    String rg;
    double salario;

    void mostra() {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Salário: " + salario);
    }
    
}

public class Main {
    public static void main(String[] args) {
        // Criação da Empresa
        Empresa empresa = new Empresa(3);// Array inicial com capacidade para 3 funcionários

        // Criando os funcionários
        Funcionario f1 = new Funcionario();
        f1.nome = "João";
        f1.rg = "123456789";
        f1.salario = 1000;

        Funcionario f2 = new Funcionario();
        f2.nome = "Maria";
        f2.rg = "987654321";
        f2.salario = 1500;

        Funcionario f3 = new Funcionario();
        f3.nome = "Pedro";
        f3.rg = "456789123";
        f3.salario = 2000;

        Funcionario f4 = new Funcionario();
        f4.nome = "Ana";
        f4.rg = "321654987";
        f4.salario = 1800;

        // Adicionando os funcionários na empresa
        empresa.adiciona(f1);
        empresa.adiciona(f2);
        empresa.adiciona(f3);
        
        //Tentando adicionar um funcionário na empresa
        empresa.adiciona(f4);

        //Realocanção da array pafra suportar mais funcinarios
        empresa.realocarFuncionarios();
        empresa.adiciona(f4);//Adicionando o f4 na nova array

        // Listando os funcionários
        empresa.listarFuncionarios();

        //Verificando se um funcionário está na empresa
        System.out.println("F1 está na empresa? " + empresa.contem(f1));
        System.out.println("F4 está na empresa? " + empresa.contem(f4));

        //Exibindo detalhes de cada funcinario usando o método mostra() 
        for (Funcionario funcionario : empresa.funcionarios) {
            if (funcionario != null) {
                funcionario.mostra();
            }
        }

    }
}

