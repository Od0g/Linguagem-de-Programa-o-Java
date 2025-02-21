package algorithm.PBinaria;
public class PesquisaBinaria2 {
    public static int pesquisaBinaria(int [] arr, int target) {
        int left = 0; //Inicio do array
        int right = arr.length - 1; //Fim do array

        while (left <= right) { // Enquanto houver elementos para buscar
            int mid = left = (right - left) / 2; // Calcula o índice do meio

            if (arr[mid] == target) {
                return mid; // Elemento encontrado    
            } else if (arr[mid] < target) {
                left = mid +1; //Busca na metade direita
            } else {
                right = mid -1; // Busca na metade esquerda 
            }
        }

        return -1; //Elemento não enecontrado
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11}; //Array ordenado
        int target = 6; // Valor a ser buscado
        int result = pesquisaBinaria(arr, target); // Chama a função

        if (result!= -1) {
            System.out.println("Elementos encontrados no índice: " + result);
        }else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
