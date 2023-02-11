package aula2;

public class Teste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.nome = "Victor";
        a2.nome = "Welder";
        a1.formatarNome(a1.nome);
        a2.formatarNome(a2.nome);

        System.out.println(a1.nome + " " + a2.nome);

        System.out.println("-----------");

        int i = Aluno.gerarIdade(20,60);
        int ii = Aluno.gerarIdade(20,60);

        a1.idade = i;
        a2.idade = ii;
        
        System.out.println(a1.idade + " " + a2.idade);
        
    }
}
