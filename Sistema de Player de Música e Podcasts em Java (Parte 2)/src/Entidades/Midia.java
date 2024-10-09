package Entidades;

import java.util.Objects;

    // Classe abstrata pai
    public abstract class Midia {
    private String titulo;   // Título da mídia.
    int duracao;   // Duração em segundos.
    private int plays;      // Número de reproduções.

    // Construtor vázio
    public Midia() {
    }

    // Construtor completo
    public Midia(String titulo, int duracao, int plays) {
        this.titulo = titulo;       // Inicializa o título.
        this.duracao = duracao; // Inicializa a duração.
        this.plays = plays;      // Inicializa o número de reproduções.
    }

    // Getter and Setter
    public String getTitle() {
        return titulo;
    }

    public void setTitle(String title) {
        this.titulo = title;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getPlays() {
        return plays;
    }

    public void setPlays(int plays) {
        this.plays = plays;
    }

    // Equals And Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Midia midia = (Midia) o;
        return duracao == midia.duracao && plays == midia.plays && Objects.equals(titulo, midia.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, duracao, plays);
    }

    // ToString
    @Override
    public String toString() {
        return "Midia{" +
                "title='" + titulo + '\'' +
                ", duration=" + duracao +
                ", plays=" + plays +
                '}';
    }

    // Metodo que deve ser implementado nas subclasses para retornar o tipo de mídia
    public String getType() {
        return ""; // Retorna uma string vazia por padrão.
    }
}
