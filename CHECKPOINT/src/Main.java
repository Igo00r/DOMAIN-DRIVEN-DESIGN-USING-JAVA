public class Main {
    public static void main(String[] args) {
        Podcast podpah = new Podcast("Podpah", "Igor Cavalari (Igão) e Thiago Marques (Mítico)", "Podpah é um podcast brasileiro apresentado por Igor Cavalari e Thiago Marques, formado em 2020. É o maior podcast do Brasil, com mais de 8 milhões de inscritos no YouTube.");
        System.out.println(podpah.toString());

        Music musicas = new Music("Matuê", "Máquina do tempo", "Reggae");
        System.out.println(musicas.toString());


            Inventario inventario = new Inventario();
            inventario.adicionarItem(new Midias("Coleman - Podpah"));
            inventario.adicionarItem(new Midias("Ninja - Podpah"));
            inventario.adicionarItem(new Midias("Mc Hariel -  Podpah"));

            inventario.listarItens();
            // Saída:
            // Espada
            // Escudo
            // Poção
        }
}