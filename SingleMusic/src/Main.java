import com.desafiomusica.audio.Audio;
import com.desafiomusica.audio.Faixas;
import com.desafiomusica.service.Favoritos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao SingleMusic! O que você deseja ouvir?");
        System.out.println(""" 
                1- Músicas
                2- Podcasts
                """);
        Scanner sc = new Scanner(System.in);
        Favoritos musicasFavoritas = new Favoritos();
        Favoritos podcastFavoritos = new Favoritos();

        Faixas faixas = new Faixas();
        Faixas podcast = new Faixas();

        int menu = sc.nextInt();
        int musicas = 1;
        int podcasts = 2;

        if (menu == 1) {
            System.out.println("Você selecionou músicas. Selecione a música que deseja ouvir");
            List<String> listMusicas = faixas.preencherLista();

            int x = 1;

            for (String musica : listMusicas) {
                System.out.println(x + " - " + musica);
                x += 1;
            }
            musicasFavoritas.favoritos(listMusicas);


        } else {
            System.out.println("Você selecionou podcasts. Selecione qual deseja ouvir");
            List<String> listpodcast = podcast.listaPodcast();

            int x2 = 1;

            for (String pods : listpodcast) {
                System.out.println(x2 + " - " + pods);
                x2 += 1;
            }
            podcastFavoritos.favoritos(listpodcast);
        }
    }
}