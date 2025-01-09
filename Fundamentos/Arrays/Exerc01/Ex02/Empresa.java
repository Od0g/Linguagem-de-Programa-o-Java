package Ex02;

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