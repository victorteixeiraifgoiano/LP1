package aula3;

public class Mensagem {
    String data;
    String autor;
    String texto;

    public void configuracaoRealizada (){
        System.out.println("Configuração realizada!");
    }

    public void atributos(String d, String a, String t){
        this.data = d;
        this.autor = a;
        this.texto = t;
    }

    public void enviar(){
        System.out.println("Olá " + autor + ", sua mensagem com texto " + texto + " foi enviada em " + data);
    }
}
