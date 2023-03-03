package aula09;

public class Data {
    int dia;
    int mes;
    int ano;
    public Data(int dia, int mes, int ano) {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        }else{System.out.println("erro no dia");}
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        }else{System.out.println("erro no mes");}
        if (ano > 0) {
            this.ano = ano;
        }else{System.out.println("erro no ano");}
    }

    public static void main(String[] args) {
        Data d1 = new Data(25, 14, 2023);
        System.out.println(d1.dia);
        System.out.println(d1.mes);
        System.out.println(d1.ano);
    }
}
