package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest07 {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Notebook";
        produto1.quantidade = 3;

        produto2.nome = "Mouse";
        produto2.quantidade = 20;

        System.out.println(produto1.nome + ": " + produto1.estoqueBaixo(5));
        System.out.println(produto2.nome + ": " + produto2.estoqueBaixo(5));

    }
}