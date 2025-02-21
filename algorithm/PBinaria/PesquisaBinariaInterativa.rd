Primeiro código feito por mim

import java.util.Scanner;

public class PesquisaBinariaInterativa {
    public static void main(String[] args) {
        int arr[] = {1,3,6,8,10};

        System.out.println("Digite o numero para sua pesquisa");
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int result = PesquisaBinariaInterativa(arr,num);

        if (result!=-1); 
            System.out.println("Valor encontrado no Index #" + result){
            }else{
                System.out.println("Valor não encontrado no Index " )
            }
    }
    
    public static int PesquisaBinariaInterativa(int[] arr, int num) {
        int start = 0;
        int ent = arr.length;

        for(int i = 0; iarr[n]) {
            start = n;
        } else{
            end = n;
        }
    }
}

Correções realizadas:
    Erro na chamada do método:
        O método PesquisaBinariaInterativa estava sendo chamado, mas não existia. O correto seria pesquisaBinariaInterativa.
    Erro no if de verificação do resultado:
        O ponto e vírgula (;) após if (result!=-1) fazia com que o else nunca fosse executado.
    Erro na impressão de mensagens:
        O System.out.println("Valor encontrado no Index #" + result){} tinha {} desnecessárias.
        O System.out.println("Valor não encontrado no Index " ) estava incompleto.
    Erros na implementação do método de busca binária:
        Variáveis ent e end: ent foi renomeado para end.
        O loop for(int i = 0; iarr[n]) estava incorreto.
        O índice de mid não estava sendo calculado corretamente.
        O nome n estava sendo usado sem contexto.