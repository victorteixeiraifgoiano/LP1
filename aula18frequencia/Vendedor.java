package aula18frequencia;

public class Vendedor extends Empregado {

    double valorVendas;
    double comissao;

    public Vendedor(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto,
            double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
        // TODO Auto-generated constructor stub
    }

    public void calcularSalario() {
        double salario = salarioBase - (salarioBase * imposto) + (valorVendas * comissao);
        System.out.println(salario);
    }

}
