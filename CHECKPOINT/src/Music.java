import java.util.Objects;

public class Music extends Playlist{
    private String artista;
    private String album;
    private String genero;

    public Music() {
    }

    public Music(String artista, String album, String genero) {
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public Music(String nome, String apresentador, String album, String descricao, double tempo, String artista, String album1, String genero) {
        super(nome, apresentador, album, descricao, tempo);
        this.artista = artista;
        this.album = album1;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String getAlbum() {
        return album;
    }

    @Override
    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Music music = (Music) o;
        return Objects.equals(artista, music.artista) && Objects.equals(album, music.album) && Objects.equals(genero, music.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), artista, album, genero);
    }

    @Override
    public String toString() {
        return "Music ---> " +
                "Artista - " + artista + '\'' +
                ", Álbum - " + album + '\'' +
                ", Gênero - " + genero + '\'' +
                '}';
    }
}
