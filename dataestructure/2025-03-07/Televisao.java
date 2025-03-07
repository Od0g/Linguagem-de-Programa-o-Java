public class Televisao {
    String marca;
    boolean ligado;
    int volume;
    int canal;

    public Televisao() {
        ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("A televisão" + marca + " foi ligada ");
    }

    public void desligar() {
        ligado = false;
        System.out.println("A televisão" + marca + " foi desligada ");
    }

    public void defineMarca(String marca) {
        this.marca = marca;
        System.out.println("A marca da televisão foi definida como " + marca);
    }

    public void defineVolume(int vol) {
        if (ligado) {
            volume = vol;
            System.out.println("TV" + marca + "Volume" + volume);
        } else {
            System.out.println("A televisão está desligada ");
        }
    }

    public void defineCanal(int ca) {
        if (ligado) {
            canal = ca;
            System.out.println("TV " + marca + "Canal " + canal);
        } else {
            System.out.println("Por favor, ligue a televisão " + marca);
        }
    }

    public void aumentaVolume() {
        volume++;
        System.out.println("TV " + marca + "Volume " + volume);
    }
}