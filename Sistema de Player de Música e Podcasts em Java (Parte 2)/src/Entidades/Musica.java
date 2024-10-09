package Entidades;

import java.util.Objects;

// Classe abstrata filha
public class Musica extends Midia {
    private String genero;

    // Construtor com título, duração e número de reproduções.
    public Musica(String genero, int duracao, int plays) {
        super(genero, duracao, plays);  // Chama o construtor da classe pai (Midia).
    }

    // Construtor completo
    public Musica(String titulo, double duracao, int plays, String genero) {
        super(titulo, (int) duracao, plays);  // Chama o construtor da classe pai.
        this.genero = genero;  // Inicializa o gênero da música.
    }

    // Getter And Setter
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        return Objects.equals(genero, musica.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(genero);
    }

    // Super ToString
    @Override
    public String toString() {
        return "Musica{" +
                "genero='" + genero + '\'' +
                "} " + super.toString();
    }
}
