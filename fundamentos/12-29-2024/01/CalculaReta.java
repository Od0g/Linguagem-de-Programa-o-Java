import java.util.Scanner;

public class CalculaReta {
    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Variavel para entrada de x
        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        //Processamento
        double y = -5 * x + 2;

        // Saída de resultado
        System.out.println("O valor de y é: " + y);

        scanner.close();
    }
}