package com.desafiomusica.audio;
import java.util.ArrayList;
import java.util.List;

public class Audio  {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private double classificacao;
    private List<String> musicas;
    private List<String> podcast;

    public List<String> getPodcast() {
        return podcast;
    }
    public void setPodcast(List<String> podcast) {
        this.podcast = podcast;
    }

    public List<String> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<String> musicas) {
        this.musicas = musicas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public void curte(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalDeReproducoes++;
    }

}



