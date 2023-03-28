package aula18frequencia;

public class Operario extends Empregado {

    double valorProducao;
    double comissao;

    public Operario(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto,
            double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
        // TODO Auto-generated constructor stub
    }

    public void calcularSalario() {
        double salario = salarioBase - (salarioBase * imposto) + (valorProducao * comissao);
        System.out.println(salario);
    }
}
