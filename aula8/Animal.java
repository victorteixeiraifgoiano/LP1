package aula8;

public class Animal {
    String nome;
    float comprimento;
    int numeroDePatas;
    String cor;
    String ambiente;
    float velocidadeMedia;

    // CONSTRUTOR
    public Animal(String nome, float comprimento, int numeroDePatas, String cor, String ambiente,
            float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    // ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    // METODOS ADICIONAIS
    void verDados() {
        System.out.println("O nome do aninal é: " + nome);
        System.out.println("O comprimento do aninal é: " + comprimento);
        System.out.println("O número de patas do aninal é: " + numeroDePatas);
        System.out.println("A cor do aninal é: " + cor);
        System.out.println("O ambiente do aninal é: " + ambiente);
        System.out.println("A velocidade média do aninal é: " + velocidadeMedia);
    }
}
