package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest04 {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.preco = 3000;

        System.out.println("Preço original: R$ " + produto.preco);
        System.out.println("Preço com desconto: R$ " + produto.aplicarDesconto(10));

    }
}