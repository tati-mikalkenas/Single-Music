package com.desafiomusica.audio;

import java.util.ArrayList;
import java.util.List;

public class Faixas {
    public List<String> preencherLista(){

        List<String> listMusicas = new ArrayList<>();
        listMusicas.add("Belo- Pra ver o sol brilhar");
        listMusicas.add("AnaVitoria - O tempo é agora");
        listMusicas.add("Chris Brown - You");
        listMusicas.add("Chris Brown - Run It");
        return listMusicas;
    }

    public List<String> listaPodcast(){

        List<String> listpodcast = new ArrayList<>();
        listpodcast.add("Podpah- Entrevistando Gabigol");
        listpodcast.add("PodDelas- Autoestima e Empoderamento feminino");
        listpodcast.add("PodCats: A relação entre música e atitude mental");
        return listpodcast;
    }

}
