import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criar itens do cardápio
        PratoPrincipal itemLasanha = criarPratoPrincipal("Lasanha", "Lasanha de presunto, queijo e carne moída", 40, "30 minutos");
        Bebida bebidaSoda = criarBebida("Soda", "Soda com gás", 8, "Gelada");

        // Imprimir detalhes dos itens
        System.out.println(itemLasanha);
        System.out.println(bebidaSoda);

        // Criar pedido e adicionar itens
        Pedido pedido = new Pedido();
        pedido.setNome("Pedido da Manu");  // Definir o nome do pedido

        // Adicionar itens ao pedido
        adicionarItemAoPedido(pedido, itemLasanha);
        adicionarItemAoPedido(pedido, bebidaSoda);

        // Imprimir detalhes do pedido após adicionar os itens
        System.out.println("Detalhes do Pedido após adicionar itens:");
        System.out.println(pedido);

        // Remover itens do pedido
        removerItemDoPedido(pedido, bebidaSoda);
        removerItemDoPedido(pedido, itemLasanha);

        // Imprimir detalhes do pedido após a remoção
        System.out.println("Detalhes do Pedido após remover itens:");
        System.out.println(pedido);
    }

    private static PratoPrincipal criarPratoPrincipal(String nome, String descricao, double preco, String tempoPreparo) {
        return new PratoPrincipal(nome, descricao, preco, tempoPreparo);
    }

    private static Bebida criarBebida(String nome, String descricao, double preco, String temperatura) {
        return new Bebida(nome, descricao, preco, temperatura);
    }

    private static void adicionarItemAoPedido(Pedido pedido, Cardapio item) {
        pedido.adicionarItem(item);
        System.out.println("Adicionado: " + item);
    }

    private static void removerItemDoPedido(Pedido pedido, Cardapio item) {
        pedido.removerItem(item);
        System.out.println("Removido: " + item);
    }
}
