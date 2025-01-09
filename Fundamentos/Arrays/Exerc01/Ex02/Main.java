package Ex02;

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