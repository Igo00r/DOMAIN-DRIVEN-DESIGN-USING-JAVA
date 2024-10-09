import StreamAPI.MidiaFilter;        // Importa a classe para filtrar mídias.
import StreamAPI.MidiaGrouping;      // Importa a classe para agrupar mídias.
import StreamAPI.PlaylistStats;      // Importa a classe para estatísticas da playlist.
import Entidades.Midia;              // Importa a classe pai Midia.
import Entidades.Musica;             // Importa a classe Musica.
import Entidades.EpisodioPodcast;    // Importa a classe EpisodioPodcast.

import java.util.Arrays;              // Importa Arrays para manipulação de arrays.
import java.util.List;                // Importa List para trabalhar com listas.
import java.util.Map;                 // Importa Map para usar mapas.

public class Main {
    public static void main(String[] args) {
        // Cria uma lista de mídias (playlist) com músicas e episódios de podcast.
        List<Midia> playlist = Arrays.asList(
                new Musica("Better now", 210, 100, "Hip-hop e Pop"), // 3 minutos e 30 segundos
                new Musica("Leans Pt-2", 151, 100, "Trap"), // 2 minutos e 31 segundos
                new EpisodioPodcast("CHRIS HEMSWORTH - Podpah #631", 2700, 100, "Igor Cavalari (Igão) e Thiago Marques (Mítico)"), // 45 minutos
                new EpisodioPodcast("PRADO - Podpah #824", 7530, 100, "Igor Cavalari (Igão) e Thiago Marques (Mítico)") // 2 horas e 5 minutos
        );


        // Filtra mídias por duração máxima
        List<Midia> shortMidia = MidiaFilter.filterByDuracao(playlist, 11000);
        System.out.println("Mídias:");
        shortMidia.forEach(midia -> System.out.println(midia.getTitle())); // Exibe os títulos das mídias filtradas.

        // Calcula a duração total da playlist.
        int totalDuracao = PlaylistStats.calculateTotalDuracao(playlist);
        System.out.println("Duração total da playlist: " + totalDuracao + " segundos");

        // Encontra a mídia mais longa da playlist.
        Midia longest = PlaylistStats.findLongestMidia(playlist);
        System.out.println("Mídia mais longa: " + longest.getTitle());

        // Agrupa mídias
        Map<String, Long> midiaGroups = MidiaGrouping.groupByType(playlist);
        System.out.print("Mídias agrupadas: ");
        midiaGroups.forEach((type, count) -> System.out.print(type + " " + count + " ")); // Exibe a contagem de cada tipo na mesma linha.
        System.out.println();
        }
    }
