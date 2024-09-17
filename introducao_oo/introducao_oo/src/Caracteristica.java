import java.util.Objects;

public class Caracteristica {
    private String nome;
    private String descricao;

    public Caracteristica() {
    }

    public Caracteristica(String descricao, String nome) {
        this.descricao = descricao;
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caracteristica that = (Caracteristica) o;
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(getDescricao(), that.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao());
    }

    @Override
    public String toString() {
        return "Caracteristica{" +
                "descricao='" + descricao + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

}
