package aula05;

//Alunos: Victor Emannuel e Welder

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("victor", "teixeira", 1000);
        Empregado e2 = new Empregado("renato", "teixeira", 10000);

        System.out.println(e1.salarioMensal);
        System.out.println(e2.salarioMensal);

        e1.setSalarioMensal((e1.getSalarioMensal() * 0.1 + e1.getSalarioMensal()) * 12);
        e2.setSalarioMensal((e2.getSalarioMensal() * 0.1 + e2.getSalarioMensal()) * 12);

        System.out.println(e1.salarioMensal);
        System.out.println(e2.salarioMensal);
    }
}
