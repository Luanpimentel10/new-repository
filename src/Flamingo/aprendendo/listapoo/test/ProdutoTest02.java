package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest02 {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.preco = 3500.00;
        produto.quantidade = 10;

        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço unitário: R$ " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Valor total: R$ " + produto.calcularValorTotal());

    }
}