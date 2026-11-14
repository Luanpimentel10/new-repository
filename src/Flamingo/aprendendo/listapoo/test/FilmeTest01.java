package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Filme;

public class FilmeTest01 {

    public static void main(String[] args) {

        Filme filme = new Filme();

        filme.titulo = "Vingadores: Ultimato";
        filme.genero = "Ação";
        filme.duracaoMinutos = 181;
        filme.classificacaoIndicativa = 12;

        System.out.println("Título: " + filme.titulo);
        System.out.println("Gênero: " + filme.genero);
        System.out.println("Duração: " + filme.duracaoMinutos + " minutos");
        System.out.println("Classificação indicativa: " + filme.classificacaoIndicativa + " anos");

    }
}