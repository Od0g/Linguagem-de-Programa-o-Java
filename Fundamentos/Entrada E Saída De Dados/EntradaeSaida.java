import java.util.Scanner;

public class EntradaeSaida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, Digite seu nome!");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome);
        scanner.close();

    }

}
