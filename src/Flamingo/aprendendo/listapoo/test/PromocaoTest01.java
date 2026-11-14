package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Produto;
import Flamingo.aprendendo.listapoo.dominio.Promocao;

public class PromocaoTest01 {

    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "Notebook";
        produto.preco = 3000;

        Promocao promocao = new Promocao();

        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço original: R$ " + produto.preco);

        promocao.aplicarDesconto(produto, 10);

        System.out.println("Preço com desconto: R$ " + produto.preco);

    }
}