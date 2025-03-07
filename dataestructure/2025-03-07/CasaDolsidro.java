public class CasaDolsidro {
    public static void main(String[] args) {
        Televisao t1, t2;

        t1 = new Televisao();
        t2 = new Televisao();

        t1.defineMarca("Samsung");
        t2.defineMarca("LG");

        t1.ligar();
        t2.ligar();

        t1.defineCanal(5);
        t2.defineCanal(10);

        t2.defineCanal(15);
        t2.defineCanal(20);
        t2.defineCanal(25);
        t2.defineCanal(30);
        t2.defineCanal(35);
        t2.defineCanal(40);

        t1.desligar();
        t2.desligar();

    }
}
