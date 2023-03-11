package aula15;

public class Vip extends Ingresso {

    public Vip(double valor) {
        super(valor);
        // TODO Auto-generated constructor stub
        super.valor = valor + 50;
    }

    public double retornaValor() {
        return valor;
    }

}
