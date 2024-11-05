//Exercício 4: Contagem de Palavras que Contêm uma Letra Específica
//Descrição: Contamos quantas strings contêm um caractere específico.
//Passos:
//Usamos filter para encontrar as strings que contêm o caractere.
//Usamos count para contar essas strings.

import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Cria uma lista de palavras
        List<String> palavras = Arrays.asList("apple", "banana", "cherry", "date");

        // Caractere a ser buscado nas palavras
        char letra = 'a';

        // Chama o metodo contarPalavrasComLetra e armazena o resultado
        long resultado = contarPalavrasComLetra(palavras, letra);


        // Imprime o resultado da lista
        System.out.println("Número de palavras que contêm a letra '" + letra + "':" + resultado);
    }
    public static long contarPalavrasComLetra(List<String> palavras, char letra) {
        return palavras.stream()
                .filter(p -> p.indexOf(letra) != -1)    // Filtra palavras que contêm o caractere
                .count();                               // Conta quantas palavras restaram
    }
}

