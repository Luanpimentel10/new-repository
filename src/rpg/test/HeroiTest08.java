package rpg.test;

import rpg.dominio.Heroi;
import rpg.dominio.Inventario;
import rpg.dominio.Pocao;

public class HeroiTest08 {

    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";
        heroi.vida = 50;
        heroi.vidaMaxima = 100;

        heroi.inventario = new Inventario();
        heroi.inventario.pocoes = new Pocao[10];

        Pocao pocao = new Pocao();
        pocao.nome = "Poção Pequena";
        pocao.pontosCura = 20;

        heroi.inventario.pocoes[0] = pocao;
        heroi.inventario.quantidadePocoes = 1;

        System.out.println("Vida inicial: " + heroi.vida);

        heroi.usarPocao(0);

        System.out.println("Vida após usar poção: " + heroi.vida);
        System.out.println("Poções restantes: " +
                heroi.inventario.quantidadePocoes);
    }
}