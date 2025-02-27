
public class Pessoa {
    private String cpf;

    @Override
    public int hashCode() {
        return cpf.hashCode(); // Usa o CPF para gerar o hash
    }

    @Override
    public boolean equals(Object obj) {
        Pessoa outra = (Pessoa) obj;
        return this.cpf.equals(outra.cpf); // Compara CPFs
    }
}