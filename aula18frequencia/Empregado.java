package aula18frequencia;

public class Empregado extends Pessoa {

    int codigoSetor;
    double salarioBase;
    double imposto;

    public Empregado(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
        //TODO Auto-generated constructor stub
    }

    public void calcularSalario(){
        double salario = salarioBase - (salarioBase * imposto);
        System.out.println(salario);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    
    
}
