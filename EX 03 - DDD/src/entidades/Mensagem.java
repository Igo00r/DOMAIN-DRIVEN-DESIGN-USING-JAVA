package entidades;

import java.util.Objects;

// Classe Mensagem
public class Mensagem {
    private String conteudo;
    private String autor;
    private String dataHoraEnvio;

//Construtor Vázio
    public Mensagem() {
    }

// Construtor Completo
    public Mensagem(String conteudo, String autor, String dataHoraEnvio) {
        this.conteudo = conteudo;
        this.autor = autor;
        this.dataHoraEnvio = dataHoraEnvio;
    }

// Getter And Setter
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataHoraEnvio() {
        return dataHoraEnvio;
    }

    public void setDataHoraEnvio(String dataHoraEnvio) {
        this.dataHoraEnvio = dataHoraEnvio;
    }

// Equals And Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensagem mensagem = (Mensagem) o;
        return Objects.equals(conteudo, mensagem.conteudo) && Objects.equals(autor, mensagem.autor) && Objects.equals(dataHoraEnvio, mensagem.dataHoraEnvio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conteudo, autor, dataHoraEnvio);
    }

// Super ToString
    @Override
    public String toString() {
        return "Mensagem: " +
                "conteúdo: " + conteudo + '\'' +
                ", autor: " + autor + '\'' +
                ", dataHoraEnvio= " + dataHoraEnvio + '\'' +
                '|';
    }
}

