package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Produto;
import Flamingo.aprendendo.listapoo.dominio.CadastroProduto;

public class CadastroProdutoTest01 {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        CadastroProduto cadastro = new CadastroProduto();

        cadastro.cadastrar(produto1, "Notebook", 3000, 2);
        cadastro.cadastrar(produto2, "Mouse", 100, 5);

        System.out.println("Nome: " + produto1.nome);
        System.out.println("Preço: R$ " + produto1.preco);
        System.out.println("Quantidade: " + produto1.quantidade);

        System.out.println("-------------------");

        System.out.println("Nome: " + produto2.nome);
        System.out.println("Preço: R$ " + produto2.preco);
        System.out.println("Quantidade: " + produto2.quantidade);

    }
}