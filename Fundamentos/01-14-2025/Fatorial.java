import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int n;

        // Solicitar número ao usuário
        System.out.print("Digite um número inteiro positivo: ");
        n = Scanner.nextInt();

        if (n < 0) {
            System.out.println("Número inválido! Insira um número positivo.");
        } else {
            int fatorial = 1;

            // Calcular o fatorial
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }
    }
}
