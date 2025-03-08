
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha p = new Pilha();

        System.out.print("Digite um número decimal para converter para binário: ");

        // Loop para garantir que o usuário digite um número válido
        while (true) {
            try {
                int numero = scanner.nextInt(); // Lê a entrada do usuário
                converterParaBinario(numero, p); // Chama o método de conversão
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Digite um número inteiro válido!");
                scanner.nextLine(); // Limpa o buffer do scanner
                System.out.print("Tente novamente: ");
            }
        }

        scanner.close();
    }

    // Método para realizar a conversão
    private static void converterParaBinario(int numero, Pilha p) {
        if (numero == 0) {
            p.push(0);
        } else {
            int resto;
            while (numero != 0) {
                resto = numero % 2;
                p.push(resto);
                numero = numero / 2;
            }
        }

        System.out.print("Número em binário: ");
        while (!p.isEmpty()) {
            int resto = p.pop();
            System.out.print(resto);
        }
        System.out.println("\nFim do programa.");
    }
}