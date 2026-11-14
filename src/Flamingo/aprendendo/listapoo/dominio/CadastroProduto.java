package Flamingo.aprendendo.listapoo.dominio;

public class CadastroProduto {

    public void cadastrar(Produto produto, String nome, double preco, int quantidade) {

        produto.nome = nome;
        produto.preco = preco;
        produto.quantidade = quantidade;

    }

}