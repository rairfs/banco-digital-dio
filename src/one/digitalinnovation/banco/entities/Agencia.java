package one.digitalinnovation.banco.entities;

public class Agencia {

    private static int IDENTIFICADOR = 1;

    private int id;
    private String nome;
    private String endereco;

    public Agencia(String nome, String endereco) {
        this.id = IDENTIFICADOR++;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
