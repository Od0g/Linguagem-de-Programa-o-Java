import java.util.Scanner;

public class calculadoraAvancada{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== CALCULADORA AVANÇADA =====");
            System.out.println("1 - Adição (+)");
            System.out.println("2 - Subtração (-)");
            System.out.println("3 - Multiplicação (*)");
            System.out.println("4 - Divisão (/)");  
            System.out.println("5 - Potenciação (^)");  
            System.out.println("6 - Radiciação (raiz)");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            double num1, num2, resultado = 0;

            switch (escolha) {
                case 1: // adição
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2: // subtração
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();        
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3: // multiplicação
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4: // divisão
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;

                case 5: // potenciação
                    System.out.print("Digite a base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    num2 = scanner.nextDouble();    
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 6: // radiciação
                    System.out.print("Digite o número: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
                    }
                    break;

                case 7: // sair
                    System.out.println("Encerrando o programa em breve...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida! tente novamente.");
                    break;
            }
                
        }
        scanner.close();
        System.out.println("obrigado por usar.");
    }
}