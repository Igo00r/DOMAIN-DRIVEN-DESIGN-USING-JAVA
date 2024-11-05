//Exercício 2: Palavras com Mais de 5 Caracteres em Letras Maiúsculas
//Descrição: Filtramos strings com mais de 5 caracteres e as convertimos para maiúsculas.
//Passos:
//Usamos filter para selecionar strings com mais de 5 caracteres.
//Usamos map para converter essas strings para letras maiúsculas.
//Usamos collect para coletar o resultado em uma List.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Cria uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "programação", "exemplo", "Stream", "coleções");

        // Chama o metodo palavrasMaiusculasComMaisDe5Caracteres e armazena o resultado
        List<String> resultado = palavrasMaiusculasComMaisDe5Caracteres(palavras);

        // Imprime o resultado na tela
        System.out.println("Palavras com mais de 5 caracteres em maiúsculas: " + resultado);
    }

    // Metodo que filtra palavras e converte para maiúsculas
    public static List<String> palavrasMaiusculasComMaisDe5Caracteres(List<String> palavras) {
        return palavras.stream()
                .filter(p -> p.length() > 5)      // Filtra palavras com mais de 5 caracteres
                .map(String::toUpperCase)         // Converte cada palavra para maiúsculas
                .collect(Collectors.toList());    // Coleta as palavras em uma nova lista
    }
}
