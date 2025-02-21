package algorithm.PBinaria;

public class PesquisaBinaria {
    public static int pesquisaBinaria(int[] arr, int target) {
        int left =0;
        int right = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Elemento encontrado
            } else if (arr[mid] <target) {
                left = mid +1; // Busca na metade para direita
            } else {
                right = mid -1; //Busca na metade para esquerda 
            }
        }
        return -1; // Elemento não encontrado
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        int result = pesquisaBinaria(arr, target);

        if (result != -1) {
            System.out.println("Elemento encontrado no index: " + result);
        } else { 
            System.out.println("Elemento não encontrado.");
        }
    }
}
