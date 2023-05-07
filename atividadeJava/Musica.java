package atividadeJava;

import java.util.ArrayList;
import java.util.List;

class Musica {
    private int id;
    private String nome;
    private int duracao;
    private List<Artista> autores;
    private List<Artista> interpretes;
    private List<Album> albuns;

    public Musica(int id, String nome, int duracao) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
        this.autores = new ArrayList<>();
        this.interpretes = new ArrayList<>();
        this.albuns = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void addAutor(Artista autor) {
        autores.add(autor);
    }

    public List<Artista> getAutores() {
        return autores;
    }

    public void addInterprete(Artista interprete) {
        interpretes.add(interprete);
    }

    public List<Artista> getInterpretes() {
        return interpretes;
    }

    public void addAlbum(Album album) {
        albuns.add(album);
        album.addMusica(this);
    }

    public List<Album> getAlbuns() {
        return albuns;
    }
}
