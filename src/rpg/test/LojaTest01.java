package rpg.test;

import rpg.dominio.Heroi;
import rpg.dominio.Inventario;
import rpg.dominio.Loja;
import rpg.dominio.Pocao;

public class LojaTest01 {

    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";
        heroi.ouro = 30;

        heroi.inventario = new Inventario();
        heroi.inventario.pocoes = new Pocao[10];

        Pocao pocao = new Pocao();
        pocao.nome = "Poção Pequena";
        pocao.pontosCura = 20;
        pocao.preco = 10;

        Loja loja = new Loja();

        System.out.println("Ouro inicial: " + heroi.ouro);

        boolean comprou = loja.comprarPocao(heroi, pocao);

        System.out.println("Compra realizada? " + comprou);
        System.out.println("Ouro restante: " + heroi.ouro);
        System.out.println("Poções no inventário: " +
                heroi.inventario.quantidadePocoes);
    }
}