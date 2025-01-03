public class Imprimindo04 {
    public static void main(String[] args) {
        // Laço para percorrer de 1 a 100
        for (int i = 1; i<= 100; i++) {
            // Verifica se o número é multiplo de 3
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i + " é multiplo ");
            } else {
                System.out.println(i + " não é multiplo ");
            }
        }
    }
}
