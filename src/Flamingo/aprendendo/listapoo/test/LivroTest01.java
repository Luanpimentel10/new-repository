package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Livro;

public class LivroTest01 {

    public static void main(String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;
        livro1.preco = 39.90;

        livro2.titulo = "O Pequeno Príncipe";
        livro2.autor = "Antoine de Saint-Exupéry";
        livro2.numeroPaginas = 96;
        livro2.preco = 29.90;

        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Páginas: " + livro1.numeroPaginas);
        System.out.println("Preço: " + livro1.preco);

        System.out.println();

        System.out.println("Livro 2:");
        System.out.println("Título: " + livro2.titulo);
        System.out.println("Autor: " + livro2.autor);
        System.out.println("Páginas: " + livro2.numeroPaginas);
        System.out.println("Preço: " + livro2.preco);

    }
}