package Tabelas.Tebela_Gato;

public class WordCounter {
    public static void main(String[] args) {
        MyHashTable<String, Integer> frequenciaPalavras = new MyHashTable<>();
        String texto = "o gato caça o rato";

        for (String palavra : texto.split(" ")) {
            Integer contagem = frequenciaPalavras.get(palavra);
            if (contagem == null) {
                frequenciaPalavras.put(palavra, 1);
            } else {
                frequenciaPalavras.put(palavra, contagem + 1);
            }
        }

        System.out.println("Frequência de 'o': " + frequenciaPalavras.get("o")); // Saída: 2
    }
}