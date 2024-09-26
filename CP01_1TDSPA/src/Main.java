import entidades.EpisodioPodcast;
import entidades.Midia;
import entidades.Musica;
import entidades.Playlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var musica1 = new Musica("1993", 2,
                "Matuê", "333", "Reggae");
        var ep1 = new EpisodioPodcast("KYAN - Podpah #07", 1047,
                "PodPah", "Igor Cavalari (Igão) e Thiago Marques (Mítico)",
                "Um podcast brasileiro apresentado por Igor Cavalari e Thiago Marques, formado em 2020. É o maior podcast do Brasil, com mais de 8 milhões de inscritos no YouTube.");

        var playlist = new Playlist("Meus favoritos",
                new ArrayList<>());

        playlist.adicionarMidia(musica1);
        playlist.adicionarMidia(ep1);

        playlist.reproduzir();
    }
}
