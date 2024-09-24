public class main {
    public static void main(String[] args) {
        ProdutoFisico livro = new ProdutoFisico("albert einstein","frete grátis",40,50);
        System.out.println(livro.toString());

        // Criando o ProdutoDigital
        ProdutoDigital windows = new ProdutoDigital("Spotify Premium", "Serviço de streaming de música que permite ouvir músicas sem anúncios, com a opção de baixar faixas para ouvir offline.", 30,40);
        System.out.println(windows.toString());
    }
}
