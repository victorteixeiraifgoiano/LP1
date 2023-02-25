package aula07;

//Alunos: Victor Emannuel e Welder

public class TesteInteiroSet {
    public static void main(String[] args) {
        InteiroSet ina = new InteiroSet();

        for (int i = 0; i < 100; i++) {
            ina.insereElemento(i);
        }
        System.out.println(ina.converteEmString());
    }
}
