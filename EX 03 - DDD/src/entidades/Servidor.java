package entidades;

import java.util.List;
import java.util.Objects;

//Classe Servidor
    public class Servidor {
    private String nome;
    private List<Mensagem> mensagens; // Lista para armazenar mensagens
    private List<Usuario> usuarios; // Lista para armazenar usuários

//Construtor Vázio
    public Servidor() {
    }

// Construtor Completo
    public Servidor(String nome, List<Mensagem> mensagens, List<Usuario> usuarios) {
        this.nome = nome;
        this.mensagens = mensagens;
        this.usuarios = usuarios;
    }

// Getter And Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

//Equals And Hascodes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servidor servidor = (Servidor) o;
        return Objects.equals(nome, servidor.nome) && Objects.equals(mensagens, servidor.mensagens) && Objects.equals(usuarios, servidor.usuarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, mensagens, usuarios);
    }

// Super ToString
    @Override
    public String toString() {
        return "Servidor --> " +
                "nome: " + nome + '\'' +
                ", mensagens: " + mensagens +
                ", usuarios: " + usuarios +
                '}';
    }
}

