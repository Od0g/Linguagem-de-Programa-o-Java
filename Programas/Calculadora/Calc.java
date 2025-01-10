import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        short operacao;
        double num1 = 0, num2 = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Selecione a operação desejada:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Divisão inteira");
            System.out.println("6 - Potência");
            System.out.println("7 - Raiz quadrada");
            System.out.println("0 - Sair");
            System.out.println("Opção:");
            operacao = input.nextShort();
             
            if (operacao == 0) {
                System.out.println("Saindo...");
                break;
            }
            if (!operacaoExiste(operacao)) {
                continue;
            }

            System.out.println("Digite o primeiro número:");
            num1 = input.nextDouble();

            if (operacao != 7) { // Apenas solicita o segundo número quando necesario
                System.out.println("Digite o segundo número:");
                num2 = input.nextDouble();
            }

            if(!validaDadosDeEntrada(operacao, num1 ,num2)) {
                continue;
            }

            double resultado = calcular(operacao, num1, num2);
            System.out.println("Resultado: O resultado da operação " + getNomeOperacao(operacao) + "é: " + resultado);
        } while (operacao != 0);

        input.close();
    }   

    static double calcular (short operacao, double num1, double num2) {
        switch (operacao) {
            case 1: return  num1 + num2;
            case 2: return  num1 - num2;
            case 3: return  num1 * num2;
            case 4: return  num1 / num2;
            case 5: return  num1 % num2; 
            case 6: return  Math.pow(num1, num2);
            case 7: return  Math.sqrt(num1);
            default:return 0;
        }
    }

    static boolean operacaoExiste(short operacao) {
        if (operacao < 1 || operacao > 7) {
            System.out.println("Operação inválida!");
            return false;
        }
        return true;
    }

    static boolean validaDadosDeEntrada(short operacao, double num1, double num2) {
        if( operacao == 4 && num2 == 0) {
            System.out.println("Divisão por zero!");
            return false;
        }
        if (operacao == 7 && num1 < 0) {
            System.out.println("ão é possivel calcular a raiz quadrada de um número negativo!");
            return false;
        }
        return true;
    }

    /**
     * Retorna o nome da operação correspondente ao código fornecido.
     *
     * @param operacao o código da operação (0 a 7)
     * @return o nome da operação ou uma string vazia para um código inválido
     */

     static String getNomeOperacao(short operacao) {
        return switch (operacao) {
            case 1 -> "Soma";
            case 2 -> "Subtração";
            case 3 -> "Multiplicação";
            case 4 -> "Divisão";
            case 5 -> "Divisão inteira";
            case 6 -> "Potência";
            case 7 -> "Raiz quadrada";
            default -> "";
        };
    }
}

    



