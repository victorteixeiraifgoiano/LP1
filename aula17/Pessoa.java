package aula17;

public class Pessoa {
    int anoDeNascimento;
    String nome;

    public Pessoa(int anoDeNascimento, String nome) {
        this.anoDeNascimento = anoDeNascimento;
        this.nome = nome;
    }

    public void mostrarDados() {
        String variavel = nome + anoDeNascimento;
        System.out.println(variavel);
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
