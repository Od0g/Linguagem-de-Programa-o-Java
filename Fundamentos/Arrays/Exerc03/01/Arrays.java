import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        int v[] = { 1, 2, 3, 4, 15 };
        List<Integer> lista = new ArrayList<>();
        for (int i : v) {
            lista.add(i);
        }
        // Imprimir a lista
        // O jeito mais fácil é simplesmente imprimir a lista inteira:
        System.out.println(lista);
        // Se quiser imprimir cada elemento separadamente, pode fazer um for:
        for (Integer i : lista) {
            System.out.println(i);
        }
    }
}
