package aula7;

//Alunos: Victor Emannuel e Welder

public class InteiroSet {
    private boolean[] conjunto;

    public InteiroSet() {
        conjunto = new boolean[100];
    }

    public void adicionar(int valor) {
        if (valor >= 0 && valor < 100) {
            conjunto[valor] = true;
        } else {
            throw new IllegalArgumentException("O valor deve estar entre 0 e 99.");
        }
    }

    public void remover(int valor) {
        if (valor >= 0 && valor < 100) {
            conjunto[valor] = false;
        } else {
            throw new IllegalArgumentException("O valor deve estar entre 0 e 99.");
        }
    }

    public boolean contem(int valor) {
        if (valor >= 0 && valor < 100) {
            return conjunto[valor];
        } else {
            throw new IllegalArgumentException("O valor deve estar entre 0 e 99.");
        }
    }
}
