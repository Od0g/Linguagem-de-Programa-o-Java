public class Bancoj {
    public static void main(String[] args) {
        // Criando instâncias da classe Data
        Data dataEntrada1 = new Data(5, 1, 2025);
        Data dataEntrada2 = new Data(10, 1, 2025);

        // Criando instâncias da classe Funcionario
        Funcionario f1 = new Funcionario("João", "TI", 3000.0, "123456", dataEntrada1);
        Funcionario f2 = new Funcionario("Maria", "RH", 2500.0, "654321", dataEntrada2);

        // Testando os métodos do Funcionario
        f1.mostra();
        f1.bonifica(500);
        f1.mostra();

        f2.demite();
        f2.mostra();

        // Comparando duas referências ao mesmo objeto
        Funcionario f3 = f1;
        System.out.println("f1 == f3? " + (f1 == f3)); // true, porque apontam para o mesmo objeto
    }
}

// Classe Funcionario
class Funcionario  {
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private boolean naEmpresa;
    private Data entrada; //Referência para a classe Data

    //Construtor
    public Funcionario(String nome, String departamento, double salario, String rg, Data entrada) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.rg = rg;
        this.naEmpresa = true;// Por padrão, o funcionario está na empresa
        this.entrada = entrada;

    }

    //Métodos
    public void bonifica(double aumento) {
        this.salario += aumento;

    }

    public void demite() {
        this.naEmpresa = false;

    }
     
    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("RG: " + this.rg);
        System.out.println("Data de entrada: " + this.entrada);
        System.out.println("Está na empresa? " + this.naEmpresa);
    }
}

class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
