import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap<String, Integer> agenda = new HashMap<>();
        agenda.put("Alice", 12345678); // Insere chave-valor (Insere um novo contato)
        agenda.put("Bob", 87654321);
        agenda.put("Charlie", 13579246);
        agenda.put("Alice", 99999999); // Atualiza valor (Atualiza o número de um contato)
        System.out.println(agenda.get("Alice")); // Busca valor (Busca o número de um contato)
    }
    
}
