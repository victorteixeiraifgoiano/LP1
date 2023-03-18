package aula16;

public class Peixe extends Animal {
    String caracteristica;

    public Peixe(String nome, float comprimento, int numerodepatas, String cor, String ambiente, float velocidademedia,
            String caracteristica) {
        super(nome, comprimento, numerodepatas, cor, ambiente, velocidademedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe() {
        System.out.println(nome);
        System.out.println(comprimento);
        System.out.println(numerodepatas);
        System.out.println(cor);
        System.out.println(ambiente);
        System.out.println(velocidademedia);
        System.out.println(caracteristica);
    }

}
