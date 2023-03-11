package aula14;

public class Testes {
    public static void main(String[] args) {
        Gerente f1 = new Gerente("victor", "123", 1000);
        Vendedor f2 = new Vendedor("victor", "123", 1000);
        Assistente f3 = new Assistente("victor", "123", 1000);

        double total = f1.salarioBase + f2.salarioBase + f3.salarioBase;
        System.out.println(total);

    }
}
