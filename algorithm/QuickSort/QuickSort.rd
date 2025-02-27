public static void QuickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high); // Índice do pivot
        quickSort(arr, low, pi - 1); // Ordena a esquerda
        quickSort(arr, pi + 1, high); // Ordena a direita
    }
}

private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1; // Índice do menor elemento

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            // Troca arr[i] e arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    // Coloca o pivot na posição correta
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
}