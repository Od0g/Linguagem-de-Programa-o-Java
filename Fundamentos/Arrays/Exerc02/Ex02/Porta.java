package Fundamentos.Arrays.Exerc02.Ex02;

class Porta {
    boolean aberta;

    void abrir() {
        this.aberta = true;
    }

    void fechar() {
        this.aberta = false;
    }

    boolean estaAberta() {
        return this.aberta;
    }
}
