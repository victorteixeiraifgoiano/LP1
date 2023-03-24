package aula18frequencia;

public class Fornecedor extends Pessoa {

    double valorCredito;
    double valorDivida;

    public Fornecedor(String nome, String endereco, int telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
        //TODO Auto-generated constructor stub
    }

    public void obterSaldo(){
        double saldo = valorCredito - valorDivida;
        System.out.println(saldo);
    }
    
}
