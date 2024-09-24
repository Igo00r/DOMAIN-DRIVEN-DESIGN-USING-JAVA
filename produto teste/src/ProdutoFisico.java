import java.util.Objects;

public class ProdutoFisico extends Produto {
    private String nome;
    private String frete;
    private double largura;
    private double altura;

    public ProdutoFisico() {
    }

    public ProdutoFisico(String nome, String frete, double largura, double altura) {
        this.nome = nome;
        this.frete = frete;
        this.largura = largura;
        this.altura = altura;
    }

    public ProdutoFisico(String nome, String descricao, double preco, String nome1, String frete, double largura, double altura) {
        super(nome, descricao, preco);
        this.nome = nome1;
        this.frete = frete;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoFisico that = (ProdutoFisico) o;
        return Double.compare(largura, that.largura) == 0 && Double.compare(altura, that.altura) == 0 && Objects.equals(nome, that.nome) && Objects.equals(frete, that.frete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, frete, largura, altura);
    }

    @Override
    public String toString() {
        return "ProdutoFisico--> " +
                "nome=" + nome + '\'' +
                ", frete=" + frete + '\'' +
                ", largura=" + largura +
                ", altura=" + altura +'}';
    }
}
