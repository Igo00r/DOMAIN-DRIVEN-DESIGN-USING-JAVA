import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private String descricao;
    private int quantidade;
    private ArrayList<Caracteristica> caracteristicas = new ArrayList<>();

    //Construtor vazio
    public Produto() {
    }

    //Construtor completo
    public Produto(String nome, double preco, String descricao, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Produto(ArrayList<Caracteristica> caracteristicas, String descricao, String nome, double preco, int quantidade) {
        this.caracteristicas = caracteristicas;
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters And Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
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

    public ArrayList<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<Caracteristica> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    //Métodos ou Funções
    public void AdicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void RemoverEstoque(int quantidade){
        if(this.quantidade - quantidade < 0)
            System.out.println("Quantidade insuficiente em estoque");
        else
            this.quantidade -= quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(getPreco(), produto.getPreco()) == 0 && quantidade == produto.quantidade && Objects.equals(getNome(), produto.getNome()) && Objects.equals(getDescricao(), produto.getDescricao()) && Objects.equals(caracteristicas, produto.caracteristicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPreco(), getDescricao(), quantidade, caracteristicas);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "caracteristicas=" + caracteristicas +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
