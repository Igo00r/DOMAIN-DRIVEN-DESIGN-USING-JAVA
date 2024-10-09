package StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Entidades.Midia;
import Entidades.Musica;
import Entidades.EpisodioPodcast;

public class PlaylistStats {

    // Calcula a duração total das mídias na lista.
    public static int calculateTotalDuracao(List<Midia> midiaList) {
        return midiaList.stream()
                .mapToInt(Midia::getDuracao)  // Mapeia cada mídia para sua duração.
                .sum();  // Soma todas as durações.
    }

    // Encontra a mídia com a maior duração.
    public static Midia findLongestMidia(List<Midia> midiaList) {
        return midiaList.stream()
                .max(Comparator.comparingInt(Midia::getDuracao))  // Compara pela duração.
                .orElse(null);  // Retorna null se não houver mídias.
    }

    // Encontra a mídia com a menor duração.
    public static Midia findShortestMidia(List<Midia> midiaList) {
        return midiaList.stream()
                .min(Comparator.comparingInt(Midia::getDuracao))  // Compara pela duração.
                .orElse(null);  // Retorna null se não houver mídias.
    }

    // Filtra a lista por gênero de música.
    public static List<Midia> filterByGenero(List<Midia> midiaList, String genero) {
        return midiaList.stream()
                .filter(midia -> // Filtra por gênero.
                        midia instanceof Musica && ((Musica) midia).getGenero().equalsIgnoreCase(genero)) // Verifica se a mídia é uma música do gênero especificado.
                .collect(Collectors.toList());  // Coleta os resultados em uma lista.
    }

    // Filtra a lista por apresentador de podcast.
    public static List<Midia> filterByApresentador(List<Midia> midiaList, String apresentador) {
        return midiaList;
    }
}
