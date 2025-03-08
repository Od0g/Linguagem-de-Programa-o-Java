public class ClasseQueUsaTV {
    public static void main(String[] args) {
        Televisao t = new Televisao();
        t.defineMarca("Samsung");
        t.ligar();
        t.defineCanal(5);
        t.aumentaVolume();
        t.desligar();
    }
}
