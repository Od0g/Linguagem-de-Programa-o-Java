package algorithm.PBinaria;
import java.util.Scanner;

public class PesquisaBinariaInterativa {
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 8, 10};

        System.out.println("Digite o número para sua pesquisa:");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        input.close(); // Fechar o Scanner para evitar vazamento de recursos

        int result = pesquisaBinariaInterativa(arr, num);

        if (result != -1) { 
            System.out.println("Valor encontrado no índice #" + result);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    public static int pesquisaBinariaInterativa(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1; // O índice final deve ser arr.length - 1

        while (start <= end) {
            int mid = start + (end - start) / 2; // Evita estouro de int

            if (arr[mid] == num) {
                return mid; // Retorna o índice encontrado
            } else if (arr[mid] < num) {
                start = mid + 1; // Buscar na metade direita
            } else {
                end = mid - 1; // Buscar na metade esquerda
            }
        }
        return -1; // Retorna -1 se não encontrar o número
    }
}
