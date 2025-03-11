package Tabelas.Tebela_Gato;

public class MyHashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[] table;

    @SuppressWarnings("unchecked")
    public MyHashTable() {
        table = (Entry<K, V>[]) new Entry[DEFAULT_CAPACITY];
    }

    // Método para inserir ou atualizar um valor
    public void put(K key, V value) {
        int hash = getHash(key);
        table[hash] = new Entry<>(key, value); // Implementação básica (sem tratamento de colisões)
    }

    // Método para recuperar um valor
    public V get(K key) {
        int hash = getHash(key);
        Entry<K, V> entry = table[hash];// Implementação básica (sem tratamento de colisões)
        return (entry != null && entry.key.equals(key)) ? entry.value : null;// Implementação básica (sem tratamento de
                                                                             // colisões)
    }

    // Função de hash simples
    private int getHash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Classe interna para armazenar pares chave-valor
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
