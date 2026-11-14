package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest06 {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.preco = 3000;

        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço: R$ " + produto.preco);
        System.out.println("Preço com frete: R$ " + produto.calcularFrete(50));

    }
}