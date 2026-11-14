package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Livro;

public class LivroTest02 {

    public static void main(String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.titulo = "Dom Casmurro";
        livro1.numeroPaginas = 256;

        livro2.titulo = "O Senhor dos Anéis";
        livro2.numeroPaginas = 450;

        System.out.println(livro1.titulo + ": " + livro1.verificarTamanho());
        System.out.println(livro2.titulo + ": " + livro2.verificarTamanho());

    }
}