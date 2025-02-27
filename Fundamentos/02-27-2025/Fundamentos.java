public class Fundamentos {
    public static void main(String[] args) {
        System.out.println("Fundamentos de programação");
        System.out.println("-------JAVA-------");
        System.out.println("27/02/2025");

        int idade = 25; // Número inteiro
        System.out.println(idade); // Imprime a variável idade

        double altura = 1.75; // Número com casas decimais
        System.out.println(altura); // Imprime a variável altura

        char sexo = 'M'; // Caractere
        System.out.println(sexo); // Imprime a variável sexo

        boolean casado = false; /// Verdadeiro ou falso
        System.out.println(casado); // Imprime a variável casado

        String nome = "Augusto"; // Texto
        System.out.println("O meu nome é: " + nome); // Imprime a variável nome

        // Operadores aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b; // Multiplicação
        int divisao = a / b; // Divisão inteira
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + (a % b));

        // Operadores relacionais
        System.out.println("a == b: " + (a == b)); // Verifica se a e b é igual
        System.out.println("a != b: " + (a != b)); // Verifica se a e b é diferente
        System.out.println("a > b: " + (a > b)); // Verifica se a e b é maior
        System.out.println("a < b: " + (a < b)); // Verifica se a e b é menor
        System.out.println("a >= b: " + (a >= b)); // Verifica se a e b é maior ou igual
        System.out.println("a <= b: " + (a <= b)); // Verifica se a e b é menor ou igual

        // Operadores lógicos

        int x = 10;
        int y = 5;
        boolean resultado = (a < b && x > y); // Verifica se a e b é verdadeiro
        System.out.println("a < b && x > y: " + resultado); // Verifica se a e b é verdadeiro
        System.out.println("a < b || x > y: " + (a < b || x > y)); // Verifica se a ou b é verdadeiro
        System.out.println("!(a < b): " + !(a < b)); // Verifica se a é falso

        // Operadores de atribuição
        int z = 10;
        z += 5; // z = z + 5
        System.out.println("z += 5: " + z); // Imprime a variável z
        z -= 5; // z = z - 5
        System.out.println("z -= 5: " + z);
        z *= 5; // z = z * 5
        System.out.println("z *= 5: " + z);
        z /= 5; // z = z / 5
        System.out.println("z /= 5: " + z);
        z %= 5; // z = z % 5
        System.out.println("z %= 5: " + z);

        // Estruturas condicionais

        System.out.println("Estruturas condicionais");
        int numero = 10;
        if (numero > 5) {// Se o número for maior que 5
            System.out.println("O número é maior que 5"); // Imprime a mensagem
        } else { // Senão
            System.out.println("O número é menor que 5"); // Imprime a mensagem
        }

        // Estruturas de repetição
        System.out.println("Estruturas de repetição");
        for (int i = 0; i < 10; i++) { // Para i de 0 até 10
            System.out.println("O número é: " + i); // Imprime a mensagem
        }
        // While
        System.out.println("While");
        int j = 0;
        while (j < 10) { // Enquanto j for menor que 10
            System.out.println("O número é: " + j); // Imprime a mensagem
            j++; // Incrementa o valor de j
        }
        System.out.println("Do While");
        int k = 0;
        do { // Faça
            System.out.println("O número é: " + k); // Imprime a mensagem
            k++; // Incrementa o valor de k
        } while (k < 10); // Enquanto k for menor que 10

        // estruturas de decisão
        System.out.println("Estruturas de decisão");
        int l = 10;
        if (l > 5) { // Se l for maior que 5
            System.out.println("O número é maior que 5"); // Imprime a mensagem
        } else if (l < 5) { // Senão se l for menor que 5
            System.out.println("O número é menor que 5"); // Imprime a mensagem
        } else { // Senão
            System.out.println("O número é igual a 5"); // Imprime a mensagem
        }

        // Estrutura de controle de fluxo
        System.out.println("Estrutura de controle de fluxo");
        int m = 10;
        if (m > 5) { // Se m for maior que 5
            System.out.println("O número é maior que 5"); // Imprime a mensagem
        } else if (m < 5) { // Senão se m for menor que 5
            System.out.println("O número é menor que 5"); // Imprime a mensagem
        } else { // Senão
            System.out.println("O número é igual a 5"); // Imprime a mensagem
        }

    }

}