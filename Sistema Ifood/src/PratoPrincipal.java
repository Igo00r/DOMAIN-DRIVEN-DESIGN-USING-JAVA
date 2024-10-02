import java.util.Objects;

//Classe Filho
public class PratoPrincipal extends Cardapio {
    private String tempo_estimado;

    //Construtor vázio
    public PratoPrincipal() {
    }

    //Construtor completo
    public PratoPrincipal(String tempo_estimado) {
        this.tempo_estimado = tempo_estimado;
    }

    public PratoPrincipal(String nome, String descricao, double preco, String tempo_estimado) {
        super(nome, descricao, preco);
        this.tempo_estimado = tempo_estimado;
    }

    //Getter and setter
    public String getTempo_estimado() {
        return tempo_estimado;
    }

    public void setTempo_estimado(String tempo_estimado) {
        this.tempo_estimado = tempo_estimado;
    }
    //Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PratoPrincipal that = (PratoPrincipal) o;
        return Objects.equals(tempo_estimado, that.tempo_estimado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tempo_estimado);
    }

    //Super ToString
    @Override
    public String toString() {
        return "Prato Principal---> " +
                "Tempo Estimado: " + tempo_estimado + '\'' +
                "= " + super.toString();
    }
}
