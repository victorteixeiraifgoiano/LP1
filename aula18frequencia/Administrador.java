package aula18frequencia;

public class Administrador extends Empregado {

    double ajudaDeCusto;

    public Administrador(String nome, String endereco, int telefone, int codigoSetor, double salarioBase,
            double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
        //TODO Auto-generated constructor stub
    }

    public void calcularSalario(){
        double salario = ajudaDeCusto + salarioBase - (salarioBase * imposto);
        System.out.println(salario);
    }
    
}
