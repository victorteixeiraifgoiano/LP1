package aula15;

// [ ] Crie uma classe chamada Ingresso que possui um valor em reais e um método imprimeValor.
// [ ] Crie uma classe VIP, que herda Ingresso e possui um valor adicional.
// [ ] Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
// [ ] Crie uma classe Normal, que herda Ingresso e possui um método que imprime: "Ingresso Normal".
// [ ] Crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos para acessar 
// e imprimir esta localização) e uma classe CamaroteSuperior, que é mais cara (possui valor adicional). 
// Esta última possui um método para retornar o valor do ingresso. Ambas as classes herdam a classe VIP.

public class Ingresso {
    double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double imprimeValor(double valor) {
        return valor;
    }
}
