Explicação do Código Corrigido
    1.Laço externo ( for)

        for (int n = 1; n <= 10; n++) {

    * Itera pelos números de 1 a 10, calculando o fatorial de cada um.

    2.Inicialização defatorial

        int fatorial = 1;

    * A variável fatorialé inicializada como 1 a cada iteração do laço externo.
    
    
    3.Laço interno ( for)

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

    * Calcule o fatorial de nmultiplicando os números de 1 até n.
    
    4.Impressão do resultado

        System.out.println("Fatorial de " + n + " é: " + fatorial);

    * Exibe o resultado do cálculo para cada valor de n.

Saída Esperada

O programa imprimirá:

    Fatorial de 1 é: 1
    Fatorial de 2 é: 2
    Fatorial de 3 é: 6
    Fatorial de 4 é: 24
    Fatorial de 5 é: 120
    Fatorial de 6 é: 720
    Fatorial de 7 é: 5040
    Fatorial de 8 é: 40320
    Fatorial de 9 é: 362880
    Fatorial de 10 é: 3628800
