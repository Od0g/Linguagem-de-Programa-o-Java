public static void MergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid); // Ordena a metade esquerda
        mergeSort(arr, mid + 1, right); // Ordena a metade direita
        merge(arr, left, mid, right); // Combina as duas metades
    }
}

private static void merge(int[] arr, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = left, j = mid + 1, k = 0;

    // Combina as duas metades ordenadas
    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }

    // Copia elementos restantes da esquerda (se houver)
    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    // Copia elementos restantes da direita (se houver)
    while (j <= right) {
        temp[k++] = arr[j++];
    }

    // Transfere do array temporário para o original
    System.arraycopy(temp, 0, arr, left, temp.length);
}