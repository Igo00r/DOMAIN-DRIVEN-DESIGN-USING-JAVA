package entidades;

import java.util.Objects;

// Classe Usuario
public class Usuario {
    private String nome;
    private int id;

// Construtor vázio
    public Usuario() {
    }

// Construtor Completo
    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

// Getter And Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

// Equals And Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id);
    }

//Super ToString

    @Override
    public String toString() {
        return "Usuario: " +
                "nome: " + nome + '\'' +
                ", id = " + id +
                '}';
    }
}

