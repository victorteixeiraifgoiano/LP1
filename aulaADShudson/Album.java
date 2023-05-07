package aulaADShudson;

import java.util.ArrayList;
import java.util.List;

class Album {
    private int id;
    private String nome;
    private int ano;
    private List<Artista> artistas;
    private List<Musica> musicas;

    public Album(int id, String nome, int ano) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.artistas = new ArrayList<>();
        this.musicas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public void addArtista(Artista artista) {
        artistas.add(artista);
        artista.addAlbum(this);
    }

    private void addAlbum(Album this) {
        // TODO
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void addMusica(Musica musica) {
        musicas.add(musica);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public int duracaoTotal() {
        int duracaoTotal = 0;
        for (Musica musica : musicas) {
            duracaoTotal += musica.getDuracao();
        }
        return duracaoTotal;
    }
}
