public int hashSimples(String chave, int tamanhoTabela) {
    int hash = 0;
    for (char c : chave.toCharArray()) {
        hash += (int) c; // Soma os valores ASCII dos caracteres
    }
    return hash % tamanhoTabela; // Garante que o índice está dentro da tabela
}