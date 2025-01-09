Explicação do código

    1. Classe Porta :

        * Atributo abertacontrola se a porta está aberta ou fechada.

        * Métodos abrir()e fechar()alteração do estado da porta.

        * O método estaAberta()verifica se a porta está aberta.
    
    2. Classe Casa :

        * Contém o atributo portas[], que é um array de objetos Porta.

        * O método adicionaPorta()adiciona uma porta ao array, se houver espaço.

        * O método quantasPortasEstaoAbertas()percorre o conjunto de portas e conta quantas estão abertas.

        * O método totalDePortas()retorna o total de portas que foram adicionadas à casa.


    3. ClasseMain :

        * Criamos a instância de Casae inicializamos a casa com capacidade para 3 portas.

        * Pintamos a casa de "azul" com o método pinta(). 

        * Criamos 3 portas, adicionamos à casa e controlamos o estado de cada porta (aberta ou fechada).

        * Por fim, use os métodos quantasPortasEstaoAbertas()e totalDePortas()para mostrar o número de portas abertas e o total de portas.
    
    4. Neste exercicio foram postas todas as classes em um unico arquivo, não foi aplicado o conceito de boas práticas.
    
    5. O nome do arquivo deve ser o mesmo da classe pública com o método "main".    
        Exemplo;
            
            "MAIN.java".