package Entidades;

import java.util.Objects;

// Classe filho
public class EpisodioPodcast extends Midia {
    private String apresentador;  // Nome do apresentador.

    // Construtor vazio
    public EpisodioPodcast() {
    }

    // Construtor completo
    public EpisodioPodcast(String apresentador) {
        this.apresentador = apresentador;  // Inicializa o apresentador.
    }

    public EpisodioPodcast(String titulo, int duracao, int plays, String apresentador) {
        super(titulo, duracao, plays);  // Chama o construtor da classe pai (Midia).
        this.apresentador = apresentador;  // Inicializa o apresentador.
    }

    // Getter And Setter
    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;  // Atualiza o apresentador.
    }

    // Equals And Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;  // Verifica igualdade com a classe pai.
        EpisodioPodcast that = (EpisodioPodcast) o;
        return Objects.equals(apresentador, that.apresentador);  // Compara o apresentador.
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), apresentador);  // Gera o código hash.
    }

    // Super ToString
    @Override
    public String toString() {
        return "EpisodioPodcast{" +
                "apresentador='" + apresentador + '\'' +
                "} " + super.toString();  // Inclui a representação da classe pai.
    }

    // Metodo que deve retornar o apresentador (vazio por padrão, pode ser ajustado).
    public String getapresentador() {
        return "";  // Retorna uma string vazia por padrão.
    }
}
