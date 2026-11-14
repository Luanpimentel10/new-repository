package rpg.dominio;

public class Loja {

    public boolean comprarPocao(Heroi heroi, Pocao pocao) {

        if (heroi == null || pocao == null || heroi.inventario == null) {
            return false;
        }

        if (heroi.ouro < pocao.preco) {
            return false;
        }

        if (heroi.inventario.pocoes == null ||
                heroi.inventario.quantidadePocoes >= heroi.inventario.pocoes.length) {
            return false;
        }

        heroi.ouro -= pocao.preco;
        heroi.inventario.pocoes[heroi.inventario.quantidadePocoes] = pocao;
        heroi.inventario.quantidadePocoes++;

        return true;
    }

    public boolean comprarArma(Heroi heroi, Arma arma) {

        if (heroi == null || arma == null || heroi.inventario == null) {
            return false;
        }

        if (heroi.ouro < arma.preco) {
            return false;
        }

        heroi.ouro -= arma.preco;
        heroi.inventario.armaEquipada = arma;

        return true;
    }
}