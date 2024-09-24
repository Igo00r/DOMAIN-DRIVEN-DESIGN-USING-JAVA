import java.util.Objects;

public class Playlist {
    private String nome;
    private String apresentador;
    private String album;
    private String descricao;
    private double tempo;

    public Playlist() {
    }

    public Playlist(String nome, String apresentador, String album, String descricao, double tempo) {
        this.nome = nome;
        this.apresentador = apresentador;
        this.album = album;
        this.descricao = descricao;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Double.compare(tempo, playlist.tempo) == 0 && Objects.equals(nome, playlist.nome) && Objects.equals(apresentador, playlist.apresentador) && Objects.equals(album, playlist.album) && Objects.equals(descricao, playlist.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, apresentador, album, descricao, tempo);
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", apresentador='" + apresentador + '\'' +
                ", album='" + album + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tempo=" + tempo +
                '}';
    }
}
