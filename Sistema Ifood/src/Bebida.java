import java.util.Objects;

//Classe Filha
public class Bebida extends Cardapio {
    private String tipo;

    //Construtor vázio
    public Bebida() {
    }

    //Construtor completo
    public Bebida(String tipo) {
        this.tipo = tipo;
    }

    public Bebida(String nome, String descricao, double preco, String tipo) {
        super(nome, descricao, preco);
        this.tipo = tipo;
    }

    //Getter and Setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bebida bebida = (Bebida) o;
        return Objects.equals(tipo, bebida.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }

    //Super ToString
    @Override
    public String toString() {
        return "Bebida---> " +
                "Tipo: " + tipo + '\'' +
                "-" + super.toString();
    }
}
