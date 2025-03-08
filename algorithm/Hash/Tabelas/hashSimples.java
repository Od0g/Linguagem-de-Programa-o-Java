package Tabelas;public int hashSimples(String chave,int tamanhoTabela){// Função de hash simples
int hash=0;// Inicializa o valor do hash
for(char c:chave.toCharArray()){// Percorre cada caractere da chave
hash+=(int)c; // Soma os valores ASCII dos caracteres
}// Percorre cada caractere da chave
return hash%tamanhoTabela; // Índice entre 0 e tamanhoTabela-1
}