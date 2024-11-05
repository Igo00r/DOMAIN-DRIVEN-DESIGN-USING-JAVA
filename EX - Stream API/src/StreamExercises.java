import java.util.List;
import java.util.OptionalDouble;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExercises {
    // Exercício 1: Filtrar e Somar Números Pares
    public int somaNumerosPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // Exercício 2: Palavras com Mais de 4 Letras
    public List<String> palavrasMaisDe4Letras(List<String> palavras) {
        return palavras.stream()
                .filter(p -> p.length() > 4)
                .collect(Collectors.toList());
    }

    // Exercício 3: Encontrar o Maior Número
    public int maiorNumero(List<Integer> numeros) {
        return numeros.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("Lista vazia"));
    }

    // Exercício 4: Contar Palavras que Contêm uma Letra
    public long contarPalavrasComLetra(List<String> palavras, char letra) {
        return palavras.stream()
                .filter(p -> p.indexOf(letra) != -1)
                .count();
    }

    // Exercício 5: Agrupar Números por Paridade
    public Map<Boolean, List<Integer>> agruparPorParidade(List<Integer> numeros) {
        return numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }

    // Exercício 6: Calcular a Média de uma Lista de Números
    public OptionalDouble calcularMedia(List<Integer> numeros) {
        return numeros.stream()
                .mapToInt(Integer::intValue)
                .average();
    }

    // Exercício 7: Transformar Nomes em Maiúsculas
    public List<String> transformarNomesMaiusculas(List<String> nomes) {
        return nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    // Exercício 8: Filtrar Números em um Intervalo
    public List<Integer> filtrarNumerosNoIntervalo(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());
    }

    // Exercício 9: Verificar se Existe um Número Par
    public boolean existeNumeroPar(List<Integer> numeros) {
        return numeros.stream()
                .anyMatch(n -> n % 2 == 0);
    }

    // Exercício 10: Concatenar Nomes em uma String
    public String concatenarNomes(List<String> nomes) {
        return nomes.stream()
                .collect(Collectors.joining(", "));
    }
}
