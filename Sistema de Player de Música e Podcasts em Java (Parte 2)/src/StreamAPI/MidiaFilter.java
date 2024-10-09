package StreamAPI;

import Entidades.Midia;

import java.util.List;
import java.util.stream.Collectors;

public class MidiaFilter {

    // Filtra mídias pela duração máxima e as ordena por título.
    public static List<Midia> filterByDuracao(List<Midia> midiaList, int maxduracao) {
        return midiaList.stream()
                .filter(midia -> midia.getDuracao() <= maxduracao)  // Filtra pela duração.
                .sorted((m1, m2) -> m1.getTitle().compareTo(m2.getTitle()))  // Ordena pelo título.
                .collect(Collectors.toList());  // Coleta os resultados em uma lista.
    }

    // Filtra mídias pelo tipo especificado.
    public static List<Midia> filterByType(List<Midia> midiaList, String tipo) {
        return midiaList.stream()
                .filter(midia -> midia.getType().equalsIgnoreCase(tipo))  // Filtra pelo tipo.
                .collect(Collectors.toList());  // Coleta os resultados em uma lista.
    }
}
