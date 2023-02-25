package aula06;

//Alunos: Victor Emannuel e Welder

public class Data {
    int mes;
    int dia;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void displayData(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
        System.out.println(d + "/" + m + "/" + a);
    }
}
