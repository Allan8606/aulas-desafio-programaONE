package desafio.minhasmusicas.principal;

import desafio.minhasmusicas.modelos.MinhasPreferidas;
import desafio.minhasmusicas.modelos.Musica;
import desafio.minhasmusicas.modelos.Podcast;


public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setArtista("Rosa de Saron");
        musica1.setTitulo("Banda Católica");


        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();

        }
        for (int i = 0; i < 50; i++) {
            musica1.cute();
        }


        Podcast podcast1 = new Podcast();
        podcast1.setHost("Igor 3k");
        podcast1.setTitulo("Flow");

        for (int i = 0; i < 1100; i++) {
            podcast1.reproduz();
        }
        for (int i = 0; i < 60; i++) {
            podcast1.cute();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podcast1);

    }
}