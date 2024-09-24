import java.util.Objects;

public class ProdutoDigital extends Produto{
    private String nome;
    private String descricao;
    private double preco;

    public ProdutoDigital() {
    }

    public ProdutoDigital(String nome, String descricao, double preco, String nome1, String descricao1, double preco1, double tamanho) {
        super(nome, descricao, preco);
        this.nome = nome1;
        this.descricao = descricao1;
        this.preco = preco1;
    }

    public ProdutoDigital(String nome, String descricao, double preco, double tamanho) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
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
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoDigital that = (ProdutoDigital) o;
        return Double.compare(preco, that.preco) == 0
                && Objects.equals(nome, that.nome)
                && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, descricao, preco);
    }

    @Override
    public String toString() {
        return "ProdutoDigital--->" +
                "nome=" + nome + '\'' +
                ", descricao=" + descricao + '\'' +
                ", preco=" + preco +'}';
    }
}

