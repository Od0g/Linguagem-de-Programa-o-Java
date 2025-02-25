import java.util.ArrayList;
import java.util.List;

public class Array3s {
    public static void main(String[] args) {
        int v[] = { 1, 2, 3, 4, 15 };
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < v.length; i++) {
            if (i == 0) {
                lista.add(v[i] * 2);
            } else {
                lista.add(v[i]); // Mantendo elementos iguais
            }
        }
        // Imprimir a lista
        // O jeito maisácil é simplesmente imprimir a lista inteira:
        System.out.println(lista);
        // Se quiser imprimir cada elemento separadamente, pode fazer um for:
        for (Integer i : lista) {
            System.out.println(i);
        }
    }
}
