package aula4;

//Alunos: Victor Emannuel e Welder

public class Fatura {
    String numero;
    String descricao;
    int quantidade;
    double preco;
    
    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotalFatura(){
        double total;
        total = preco * quantidade;
        if (total > 0.0) {
            return total;
        }else{
            total = 0.0;
            return total;
        }
    }
    
}
