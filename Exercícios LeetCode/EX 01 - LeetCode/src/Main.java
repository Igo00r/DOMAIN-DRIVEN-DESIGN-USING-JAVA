//  Exercício 1: Soma dos Quadrados dos Números Pares
//  Descrição: Queremos somar os quadrados dos números pares em uma lista de inteiros.
//        Passos:
//        Usamos filter para pegar apenas os números pares.
//        Usamos map para elevar cada número par ao quadrado.
//        Usamos sum para somar todos os valores resultantes.
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        int resultado = somaDosQuadradosPares(numeros);
        System.out.println("Soma dos quadrados dos números pares: " + resultado);
    }

    public static int somaDosQuadradosPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 == 0)       // Filtra apenas números pares
                .map(n -> n * n)               // Eleva cada número par ao quadrado
                .mapToInt(Integer::intValue)   // Converte para IntStream para usar sum()
                .sum();                        // Soma todos os valores
    }
}
