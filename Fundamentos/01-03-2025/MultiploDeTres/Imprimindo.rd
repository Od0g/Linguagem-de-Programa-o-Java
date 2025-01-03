Explicação

    1.Laço for: O laço percorre todos os números de 1 até 100.

        for (int i = 1; i <= 100; i++) {
    * O i começa em 1 e é incrementado em 1 a cada iteração, até atingir 100.

    2.Condição if:

        if (i % 3 == 0) {
        
    * Verifique se o resto da divisão de ipor 3 é zero ( %é o operador do módulo). É verdade, o número é múltiplo de 3.

    3.Mensagens:

    * Quando o número é múltiplo de 3, imprime:

        System.out.println(i + " é múltiplo de 3");

    * Caso contrário, imprime:

        System.out.println(i + " não é múltiplo de 3");

Saída Esperada

    O programa imprimirá:   

        1 não é múltiplo de 3
        2 não é múltiplo de 3
        3 é múltiplo de 3
        4 não é múltiplo de 3
        ...
        99 é múltiplo de 3
        100 não é múltiplo de 3
    
fim se

