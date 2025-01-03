public class Fatorial {
    public static void main(String [] args) {
        for ( int n=1; n <= 10; n++) {
            int fatorial =1; // Inicializa o fatorial
            for (int i = 1; i <= n; i++) {
                fatorial *= i; //Calcula o fatorial
            }
            System.out.println("Fatorial de " + n + "é:" + fatorial);
        }
    }
    
}
