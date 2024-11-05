//Exercício 5: Filtragem de Números em um Intervalo
//Descrição: Retornamos uma lista com números entre 10 e 20, inclusive.
//Passos:
//Usamos filter para selecionar números entre 10 e 20.
//Usamos collect para coletar os resultados em uma lista.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(5, 7, 10, 12, 15, 19, 20, 25, 30);

        // Chama o metodo filtrarNumerosNoIntervalo e armazena o resultado
        List<Integer> resultado = filtrarNumerosNoIntervalo(numeros);

        // Imprime o resultado na tela
        System.out.println("Números entre 10 a 20: " + resultado);

    }
        // Metodo que filtra números no intervalo de 10 a 20
        public static List<Integer> filtrarNumerosNoIntervalo(List<Integer> numeros) {
            return numeros.stream()
                    .filter(n -> n >= 10 && n <= 20)    // Filtra números entre 10 e 20
                    .collect(Collectors.toList());      // Coleta em uma lista
    }
}