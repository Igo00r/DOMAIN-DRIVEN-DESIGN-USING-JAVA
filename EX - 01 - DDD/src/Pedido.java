import java.util.ArrayList;
import java.util.Objects;

public class Pedido {
    private ArrayList<Cardapio> itens = new ArrayList<>();
    private String nome;

    public Pedido() {
    }

    public Pedido(ArrayList<Cardapio> itens, String nome) {
        this.itens = itens;
        this.nome = nome;
    }

    public ArrayList<Cardapio> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Cardapio> itens) {
        this.itens = itens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(itens, pedido.itens) && Objects.equals(nome, pedido.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itens, nome);
    }

    @Override

    public String toString() {
        return "Pedido{" +
                "itens=" + itens +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void adicionarItem(Cardapio item){
        itens.add(new Cardapio());
    }
    public void removerItem(Cardapio item){
        itens.remove(new Cardapio());
    }
}
