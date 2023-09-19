package com.desafiomusica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Favoritos {

    public void favoritos(List<String> musicas) {
        System.out.println("Deseja favoritar alguma faixa? Sim/Não");
        Scanner sc1 = new Scanner(System.in);
        String resposta = sc1.nextLine();
        List<String> curtidaList = new ArrayList<>();

        while (resposta.equals("Sim")) {
            System.out.println("Digite o número dela");
            int curtida = sc1.nextInt();
            curtidaList.add(musicas.get(curtida - 1));
            System.out.println("Mais alguma faixa? Sim/Não");
            sc1.nextLine();
            resposta = sc1.nextLine();
        }
        System.out.println(curtidaList);
    }
}


