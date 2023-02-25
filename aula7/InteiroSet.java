package aula7;

//Alunos: Victor Emannuel e Welder

public class InteiroSet {
    private boolean[] conjunto;

    public InteiroSet() {
        conjunto = new boolean[100];
    }

    public InteiroSet uniao(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i < 100; i++) {
            resultado.conjunto[i] = this.conjunto[i] || outroConjunto.conjunto[i];
        }
        return resultado;
    }

    public InteiroSet interseccao(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i < 100; i++) {
            resultado.conjunto[i] = this.conjunto[i] && outroConjunto.conjunto[i];
        }
        return resultado;
    }

    public void insereElemento(int k) {
        this.conjunto[k] = true;
    }

    public void removeElemento(int m) {
        this.conjunto[m] = false;
    }

    public String converteEmString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < 100; i++) {
            if (this.conjunto[i]) {
                if (!isEmpty) {
                    sb.append(" ");
                }
                sb.append(i);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            sb.append("-");
        }
        return sb.toString();
    }

    public boolean eIgualA(InteiroSet outroConjunto) {
        for (int i = 0; i < 100; i++) {
            if (this.conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }
}
