import java.util.ArrayList;

public class Inventario {
    private ArrayList<Midias> itens;

    public Inventario() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Midias item){
        itens.add(item);
    }
    
    public void listarItens(){
        for (Midias item : itens) {
            System.out.println(item.getNome());
        }
    }
}
