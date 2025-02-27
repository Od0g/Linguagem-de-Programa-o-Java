import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Funcionario {
    int id;
    String nome;
    String cargo;
    double salario;

    Funcionario(int id, String nome, String cargo, double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    void exibir() {
        System.out.printf("| %-3d | %-10s | %-15s | R$%.2f |\n", id, nome, cargo, salario);
    }
}

public class ArrayDeAtributos {
    public static void main(String[] args) {
        ArrayList<Funcionario> tabela = new ArrayList<>();

        // Adicionando funcionários
        tabela.add(new Funcionario(1, "Ana", "Gerente", 7500.00));
        tabela.add(new Funcionario(2, "Carlos", "Analista", 5000.00));
        tabela.add(new Funcionario(3, "Mariana", "Desenvolvedor", 6000.00));
        tabela.add(new Funcionario(4, "José", "Técnico", 3500.00));
        tabela.add(new Funcionario(5, "Paulo", "Analista", 5500.00));

        // Exibir a tabela completa
        System.out.println("\n🔹 Lista de Funcionários:");
        exibirTabela(tabela);

        // Buscar funcionário pelo ID
        int idBusca = 3;
        Funcionario encontrado = buscarPorId(tabela, idBusca);
        if (encontrado != null) {
            System.out.println("\n🔍 Funcionário encontrado:");
            encontrado.exibir();
        } else {
            System.out.println("\n❌ Funcionário com ID " + idBusca + " não encontrado.");
        }

        // Filtrar funcionários por cargo
        String cargoBusca = "Analista";
        System.out.println("\n🔹 Funcionários com cargo '" + cargoBusca + "':");
        List<Funcionario> analistas = filtrarPorCargo(tabela, cargoBusca);
        exibirTabela(analistas);

        // Ordenar funcionários por salário
        System.out.println("\n🔹 Funcionários ordenados por salário (crescente):");
        List<Funcionario> ordenados = ordenarPorSalario(tabela);
        exibirTabela(ordenados);
    }

    // Método para exibir a tabela formatada
    public static void exibirTabela(List<Funcionario> tabela) {
        System.out.println("+-----+------------+-----------------+------------+");
        System.out.println("| ID  | Nome       | Cargo           | Salário    |");
        System.out.println("+-----+------------+-----------------+------------+");
        for (Funcionario f : tabela) {
            f.exibir();
        }
        System.out.println("+-----+------------+-----------------+------------+");
    }

    // Método para buscar um funcionário pelo ID
    public static Funcionario buscarPorId(ArrayList<Funcionario> tabela, int id) {
        for (Funcionario f : tabela) {
            if (f.id == id) {
                return f;
            }
        }
        return null;
    }

    // Método para filtrar funcionários por cargo
    public static List<Funcionario> filtrarPorCargo(ArrayList<Funcionario> tabela, String cargo) {
        return tabela.stream()
                .filter(f -> f.cargo.equalsIgnoreCase(cargo))
                .collect(Collectors.toList());
    }

    // Método para ordenar funcionários pelo salário
    public static List<Funcionario> ordenarPorSalario(ArrayList<Funcionario> tabela) {
        return tabela.stream()
                .sorted(Comparator.comparingDouble(f -> f.salario))
                .collect(Collectors.toList());
    }
}
