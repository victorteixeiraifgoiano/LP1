package aula2;

public class Aluno {
    String nome;
    String genero;
    int idade;

    public static int gerarIdade(int min, int max){
        int i = (int)(Math.random()*(max - min)) + min;
        return i;
    }

    public void formatarNome (String n){
        this.nome = n.toUpperCase();
    }
}
