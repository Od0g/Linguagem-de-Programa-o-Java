package Tabelas;

public class TabelaHashMelhorada {
    // Função de hash simples
    public static int hashMelhorado(String chave, int tamanhoTabela) {// Função de hash melhorada
        int hash = 0;// Inicializa o valor do hash
        for (char c : chave.toCharArray()) {// Percorre cada caractere da chave
            hash = 31 * hash + (int) c; // Multiplica por 31 (primo comum)
        } // Percorre cada caractere da chave
        return Math.abs(hash % tamanhoTabela); // Garante valor positivo
    }

    public static void main(String[] args) {
        // Exemplo de uso
        String chave1 = "abc";
        String chave2 = "cba";
        int tamanhoTabela = 31;

        // Calcula os hashes
        int hash1 = hashMelhorado(chave1, tamanhoTabela);
        int hash2 = hashMelhorado(chave2, tamanhoTabela);

        // Exibe os resultados
        System.out.println("Hash de '" + chave1 + "': " + hash1);
        System.out.println("Hash de '" + chave2 + "': " + hash2);
    }

}