import java.util.Objects;

//Classe Pai
public class Cardapio {
    private String nome;
    private String descricao;
    private double preco;

    //Construtor vázio
    public Cardapio() {
    }

    //Construtor completo
    public Cardapio(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cardapio cardapio = (Cardapio) o;
        return Double.compare(preco, cardapio.preco) == 0 && Objects.equals(nome, cardapio.nome) && Objects.equals(descricao, cardapio.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, preco);
    }

    //ToString
    @Override
    public String toString() {
        return "Cardápio -- " +
                "Nome: " + nome + '\'' +
                ", Descrição: " + descricao + '\'' +
                ", Preço: " + preco +
                '}';
    }
}

