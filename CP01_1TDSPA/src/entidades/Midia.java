package entidades;

import java.util.Objects;

public class Midia {
    private String titulo;
    private int duracao;

    public void reproduzir(){
        System.out.println("Reproduzindo mídia:"
                + this.titulo);
    }

    public Midia() {
    }

    public Midia(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Midia midia = (Midia) o;
        return duracao == midia.duracao && Objects.equals(titulo, midia.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, duracao);
    }

    @Override
    public String toString() {
        return "Midia{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
