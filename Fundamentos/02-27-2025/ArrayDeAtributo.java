import java.util.ArrayList;
import java.util.List;

class Habilidades {
    int id;
    String conceito;
    String oQueVocePrecisaSaber;

    Habilidades(int id, String conceito, String oQueVocePrecisaSaber) {
        this.id = id;
        this.conceito = conceito;
        this.oQueVocePrecisaSaber = oQueVocePrecisaSaber;
    }

    void exibir() {
        System.out.printf("| %-3d | %-10s | %-15s |\n", id, conceito, oQueVocePrecisaSaber);
    }
}

public class ArrayDeAtributo {
    public static void main(String[] args) {
        // Array de Atributos
        ArrayList<Habilidades> tabela = new ArrayList<>();

        // Adicionando funcionários
        tabela.add(new Habilidades(1, "Sintaxe básica", "Classes, métodos, main"));
        tabela.add(new Habilidades(2, "Variáveis e tipos", "Analista"));
        tabela.add(new Habilidades(3, "Operadores", "+, -, *, /, %, ==, !=, &&, `"));
        tabela.add(new Habilidades(4, "Estruturas de controle", "if, switch, for, while"));
        tabela.add(new Habilidades(5, "Métodos", "Criar e chamar funções (void e retorno)"));
        tabela.add(new Habilidades(6, "Arrays e listas", "int[], ArrayList<>"));
        tabela.add(new Habilidades(7, "POO", "Classes, objetos, métodos"));
        tabela.add(new Habilidades(8, "Tratamento de erros", "try-catch"));

        tabela.add(new Habilidades(9, "Entrada/Saída", "Scanner, System.out.println()"));
        tabela.add(new Habilidades(10, "Herança", "extends"));
        tabela.add(new Habilidades(11, "Polimorfismo", "sobrecarga, sobreescrita"));
        tabela.add(new Habilidades(12, "Interfaces", "implements"));

        // Exibir a tabela completa
        System.out.println("\n🔹 Lista de Funcionários:");
        exibirTabela(tabela);

    }

    // Método para exibir a tabela formatada
    public static void exibirTabela(List<Habilidades> tabela) {
        System.out.println("+-----+------------+-----------------+------------+");
        System.out.println("| ID  | Conceito    | O que Você Precisa Saber | -----------  |");
        System.out.println("+-----+------------+-----------------+------------+");
        for (Habilidades f : tabela) {
            f.exibir();
        }
        System.out.println("+-----+------------+-----------------+------------+");
    }
}
