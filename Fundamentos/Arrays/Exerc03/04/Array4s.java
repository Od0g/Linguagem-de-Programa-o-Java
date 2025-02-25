import java.util.Arrays;

public class Array4s {
    public static void main(String[] args) {
        int v[] = { 1, 2, 3, 4, 15 }; // Array de base
        int n = v.length; // Tamanho do array
        int[][] tabela = new int[n][n]; // Matriz

        // Preenchendo a matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tabela[i][j] = v[i] * v[j];
            }
        }
        // Print Table
        System.out.println("Tabela");
        for (int[] linha : tabela) {
            System.out.println(Arrays.toString(linha)); // Print each line

        }
    }

}
