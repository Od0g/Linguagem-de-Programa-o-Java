package Tabelas;public static int hashMelhorado(String chave,int tamanhoTabela){// Função de hash melhorada
int hash=0;// Inicializa o valor do hash
for(char c:chave.toCharArray()){// Percorre cada caractere da chave
hash=31*hash+(int)c; // Multiplica por 31 (primo comum)
}// Percorre cada caractere da chave
return Math.abs(hash%tamanhoTabela); // Garante valor positivo
}