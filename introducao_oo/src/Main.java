public class Main {
    public static void main(String[] args) {

        var produto1 = new Produto(
                "Coca-Cola",5.0,"Refrigerante de cola", 5);
        var produto2 = new Produto(
                "Guaraná", 4.0,"Refrigerante de guaraná", 9);
        produto1.AdicionarEstoque(-50);
        produto1.AdicionarEstoque(5);

        System.out.println(produto1);
    }
}