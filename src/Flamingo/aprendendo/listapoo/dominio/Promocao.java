package Flamingo.aprendendo.listapoo.dominio;

public class Promocao {

    public void aplicarDesconto(Produto produto, double porcentagem) {

        produto.preco = produto.preco - (produto.preco * porcentagem / 100);

    }

}