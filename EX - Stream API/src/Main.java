import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StreamExercises exercises = new StreamExercises();

        // Testando Exercício 1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Soma dos Números Pares: " + exercises.somaNumerosPares(numeros)); // 56

        // Testando Exercício 2
        List<String> palavras = Arrays.asList("apple", "banana", "pear", "grapefruit", "kiwi");
        System.out.println("Palavras com Mais de 4 Letras: " + exercises.palavrasMaisDe4Letras(palavras)); // [banana, grapefruit]

        // Testando Exercício 3
        List<Integer> numerosParaMaior = Arrays.asList(1, 4, 7, 9, 15, 6);
        System.out.println("Maior Número: " + exercises.maiorNumero(numerosParaMaior)); // 15

        // Testando Exercício 4
        System.out.println("Contagem de Palavras que Contêm 'a': " + exercises.contarPalavrasComLetra(palavras, 'a')); // 3

        // Testando Exercício 5
        Map<Boolean, List<Integer>> agrupados = exercises.agruparPorParidade(numeros);
        System.out.println("Números Agrupados por Paridade: " + agrupados); // {false=[1, 3, 5], true=[2, 4, 6]}

        // Testando Exercício 6
        System.out.println("Média dos Números: " + exercises.calcularMedia(numerosParaMaior).orElse(0)); // 7.5

        // Testando Exercício 7
        List<String> nomes = Arrays.asList("alice", "bob", "carol");
        System.out.println("Nomes em Maiúsculas: " + exercises.transformarNomesMaiusculas(nomes)); // [ALICE, BOB, CAROL]

        // Testando Exercício 8
        List<Integer> numerosNoIntervalo = Arrays.asList(5, 10, 15, 20, 25, 30);
        System.out.println("Números no Intervalo [10, 20]: " + exercises.filtrarNumerosNoIntervalo(numerosNoIntervalo)); // [10, 15, 20]

        // Testando Exercício 9
        System.out.println("Existe Número Par? " + exercises.existeNumeroPar(numeros)); // true

        // Testando Exercício 10
        System.out.println("Nomes Concatenados: " + exercises.concatenarNomes(nomes)); // alice, bob, carol
    }
}