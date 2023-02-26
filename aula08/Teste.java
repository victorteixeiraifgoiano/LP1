package aula08;

public class Teste {
    public static void main(String[] args) {
        Animal a1 = new Animal("cachorro", 10.1f, 4, "preto", "domestico", 10f);
        a1.verDados();
        Animal a2 = new Animal("gato", 2.2f, 4, "branco", "domestico", 10f);
        a2.verDados();
    }
}
