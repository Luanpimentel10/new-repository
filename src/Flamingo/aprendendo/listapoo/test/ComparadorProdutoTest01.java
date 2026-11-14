package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Produto;
import Flamingo.aprendendo.listapoo.dominio.ComparadorProduto;

public class ComparadorProdutoTest01 {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3000;

        Produto produto2 = new Produto();
        produto2.nome = "Mouse";
        produto2.preco = 100;

        ComparadorProduto comparador = new ComparadorProduto();

        Produto produtoMaisCaro = comparador.retornarProdutoMaisCaro(produto1, produto2);

        System.out.println("Produto mais caro: " + produtoMaisCaro.nome);
        System.out.println("Preço: R$ " + produtoMaisCaro.preco);

    }
}