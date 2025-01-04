public class CollatzSequence {
    public static void main(String[] args) {
        int x = 13; // Valor inicial de x
        System.out.print(x); // Imprime o valor inicial sem nova linha

        // Continua enquanto x não for 1
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2; // Se x é par
            } else {
                x = 3 * x + 1; // Se x é ímpar
            }
            System.out.print(" -> " + x); // Imprime o próximo valor
        }

        System.out.println(); // Linha final para melhorar a saída
    }
}
