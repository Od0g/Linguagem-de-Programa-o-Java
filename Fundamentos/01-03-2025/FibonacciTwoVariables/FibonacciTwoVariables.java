public class FibonacciTwoVariables {
    public static void main(String[] args) {
        int n = 10; // Numero de termos da sequência
        int a = 0, b =  1; // Início da série de Fibonacci

        System.out.print(a + " " +b); // Imprime os dois primeiros termos

        for (int i = 3; i < n; i++) { // Começa do terceiro termo
            int proximo = a + b; // Calcula o próximo termo da serie
            System.out.print(" " + proximo); // Imprime o próximo termo
            a = b; // Atualiza 'a' para o valor de 'b'
            b = proximo; // Atualiza 'b' para o proximo número na série
        }
        System.err.println(); // Linha para melhorar a saída
    }
}
    

