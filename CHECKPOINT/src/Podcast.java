import java.util.Objects;

public class Podcast extends Playlist {
    private String nome;
    private String apresentador;
    private String descricao;

    public Podcast() {
    }

    public Podcast(String nome, String apresentador, String descricao) {
        this.nome = nome;
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    public Podcast(String nome, String apresentador, String album, String descricao, double tempo, String nome1, String apresentador1, String descricao1) {
        super(nome, apresentador, album, descricao, tempo);
        this.nome = nome1;
        this.apresentador = apresentador1;
        this.descricao = descricao1;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getApresentador() {
        return apresentador;
    }

    @Override
    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Podcast podcast = (Podcast) o;
        return Objects.equals(nome, podcast.nome) && Objects.equals(apresentador, podcast.apresentador) && Objects.equals(descricao, podcast.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, apresentador, descricao);
    }

    @Override
    public String toString() {
        return "Podcast ---> " +
                "Nome - " + nome + '\'' +
                ", Apresentador - " + apresentador + '\'' +
                ", Descrição - " + descricao + '\'' +
                '}';
    }
}
