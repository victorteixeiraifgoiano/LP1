package aulaADShudson;

public class Teste {
    public static void main(String[] args) {
        // Criação dos artistas
        Artista autor = new Artista(1, "Autor", "Brasileiro");
        Artista interprete = new Artista(2, "Interprete", "Argentino");

        // Criação das músicas
        Musica musica = new Musica(1, "Música", 180);

        // Adição dos autores e intérpretes às músicas
        musica.addAutor(autor);
        musica.addInterprete(interprete);

        // Criação do álbum
        Album album = new Album(1, "Álbum", 2022);

        // Adição dos artistas e músicas ao álbum
        album.addArtista(autor);
        album.addArtista(interprete);
        album.addMusica(musica);

        // Impressão das informações
        System.out.println("Artistas:");
        System.out.println(autor.getNome() + " - " + autor.getNacionalidade());
        System.out.println(interprete.getNome() + " - " + interprete.getNacionalidade());

        System.out.println("\nMúsicas:");
        System.out.println(musica.getNome() + " - " + musica.getDuracao() + "s");

        System.out.println("\nÁlbum:");
        System.out.println(album.getNome() + " - " + album.getAno());
        System.out.println("Artistas:");
        for (Artista artista : album.getArtistas()) {
            System.out.println(artista.getNome());
        }
        System.out.println("Músicas:");
        for (Musica m : album.getMusicas()) {
            System.out.println(m.getNome());
        }
        System.out.println("Duração total: " + album.duracaoTotal() + "s");
    }
}

