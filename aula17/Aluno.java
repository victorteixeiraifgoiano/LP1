package aula17;

public class Aluno extends Pessoa {
    float nota;

    public Aluno(int anoDeNascimento, String nome, float nota) {
        super(anoDeNascimento, nome);
        this.nota = nota;
    }

    public void mostrarDados() {
        String variavel = nome + anoDeNascimento + nota;
        System.out.println(variavel);
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

}
