package Fundamentos.TesteDeMesa;

import java.util.Scanner;

public class TestedeMesa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numA;
        int numB;
        float media;
        
        numA = teclado.nextInt();
        numB = teclado.nextInt();
        media = (float)(numA+numB)/2;
        System.out.printf("Média igual a %.2f\n", media);
        teclado.close();

    }
    
}
