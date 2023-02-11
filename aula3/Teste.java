package aula3;

public class Teste {
    public static void main(String[] args) {
        Mensagem m = new Mensagem();

        m.atributos("11 de fevereiro de 2023", "Víctor Emannuel", "MENSAGEM");
        m.configuracaoRealizada();
        m.enviar();
    }
}