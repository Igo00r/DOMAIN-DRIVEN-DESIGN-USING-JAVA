import java.util.ArrayList;
import java.util.Objects;

public class Pedido {
    private ArrayList<Cardapio> itens = new ArrayList<>();
    private String nome;
    private String status = "Novo";  // Status inicial


    //Construtor vázio
    public Pedido() {
    }

    //Construtor completo
    public Pedido(ArrayList<Cardapio> itens, String nome) {
        this.itens = itens;
        this.nome = nome;
    }

    //Definir a lista de itens do pedido
    public ArrayList<Cardapio> getItens() {
        return itens;
    }
    public void setItens(ArrayList<Cardapio> itens) {
        this.itens = itens;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    //Adicionar e remover itens
    public void adicionarItem(Cardapio item) {
        itens.add(item);
    }

    public void removerItem(Cardapio item) {
        itens.remove(item);
    }

    //Cálculo do pedido
    public double calcularTotal() {
        double total = 0;
        for (Cardapio item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    //Equals and Hashcode
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


    //ToString
    @Override
    public String toString() {
        String itensString = "itens: [";
        for (Cardapio item : itens) {
            itensString += item.toString() + ", ";
        }
        if (!itens.isEmpty()) {
            itensString = itensString.substring(0, itensString.length() - 2); // Remove a última vírgula e espaço
        }
        itensString += "], "; // Adiciona a vírgula após a lista de itens

        // Montando a string final
        return "Pedido---> " +
                itensString +
                "nome: " + nome + '\'' +
                ", status: " + status + '\'' +
                ", total: " + calcularTotal() +
                '-';
    }
}