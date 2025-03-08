package Tabelas;

public class TabelaHash {
    // Função de hash simples
    public static int hashSimples(String chave, int tamanhoTabela) {
        int hash = 0;
        for (char c : chave.toCharArray()) {
            hash += (int) c;
        }
        return hash % tamanhoTabela;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        String chave1 = "abc";
        String chave2 = "cba";
        int tamanhoTabela = 10;

        // Calcula os hashes
        int hash1 = hashSimples(chave1, tamanhoTabela);
        int hash2 = hashSimples(chave2, tamanhoTabela);

        // Exibe os resultados
        System.out.println("Hash de '" + chave1 + "': " + hash1);
        System.out.println("Hash de '" + chave2 + "': " + hash2);
    }

}