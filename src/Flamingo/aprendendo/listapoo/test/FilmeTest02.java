package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Filme;

public class FilmeTest02 {

    public static void main(String[] args) {

        Filme filme1 = new Filme();
        Filme filme2 = new Filme();

        filme1.titulo = "Vingadores";
        filme1.duracaoMinutos = 181;

        filme2.titulo = "Shrek";
        filme2.duracaoMinutos = 90;

        System.out.println(filme1.titulo + ": " + filme1.isFilmeLongo());
        System.out.println(filme2.titulo + ": " + filme2.isFilmeLongo());

    }
}