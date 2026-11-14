package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Produto;
import Flamingo.aprendendo.listapoo.dominio.ImpressoraProduto;

public class ImpressoraProdutoTest01 {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Notebook";
        produto1.preco = 3000;
        produto1.quantidade = 2;

        produto2.nome = "Mouse";
        produto2.preco = 100;
        produto2.quantidade = 5;

        ImpressoraProduto impressora = new ImpressoraProduto();

        impressora.imprime(produto1);
        impressora.imprime(produto2);

    }
}