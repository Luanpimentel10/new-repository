package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest03 {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Notebook";
        produto1.preco = 3500;

        produto2.nome = "Mouse";
        produto2.preco = 80;

        System.out.println(produto1.nome + ": " + produto1.verificarCategoria());
        System.out.println(produto2.nome + ": " + produto2.verificarCategoria());

    }
}