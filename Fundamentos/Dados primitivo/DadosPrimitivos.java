public class DadosPrimitivos {
    public static void main(String[] args) {
        //Tipos numericos inteiros
        byte b = 100;
        short s = 10000;
        int i = 1000000;
        long l = 1000000L;

        //Tipos numericos decimais
        float f = 10.5f;
        double d = 20.5;

        //Tipos caracter
        char c = 'A';
        String str = "Augusto";

        //Tipos logico
        boolean bool = true;

        System.out.println("O valor de b é: " + b);
        System.out.println("O valor de s é: " + s);
        System.out.println("O valor de i é: " + i);
        System.out.println("O valor de l é: " + l);
        System.out.println("O valor de f é: " + f);
        System.out.println("O valor de d é: " + d);
        System.out.println("O valor de c é: " + c);
        System.out.println("O valor de str é: " + str);

        if (bool) {
            System.out.println("O valor é verdadeiro");
        } else {
            System.out.println("O valor é falso");
        }
    }
}
