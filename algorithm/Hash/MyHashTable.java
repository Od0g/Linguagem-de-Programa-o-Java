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
System.out.println(frequenciaPalavras.get("o")); // Saída: 2