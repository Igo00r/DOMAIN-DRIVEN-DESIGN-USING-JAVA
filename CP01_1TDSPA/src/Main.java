import entidades.EpisodioPodcast;
import entidades.Musica;
import entidades.Playlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var musica1 = new Musica("One", 180,
                "Metallica", "Black Album", "Metal");
        var ep1 = new EpisodioPodcast("OO com Java", 3600,
                "PodJava", "JavaMan",
                "Neste episódio falamos sobre OO com Java");

        var playlist = new Playlist("Meus favoritos",
                new ArrayList<>());

        playlist.adicionarMidia(musica1);
        playlist.adicionarMidia(ep1);

        playlist.reproduzir();
    }
}
