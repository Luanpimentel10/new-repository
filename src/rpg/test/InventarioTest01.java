package rpg.test;

import rpg.dominio.Arma;
import rpg.dominio.Heroi;
import rpg.dominio.Inventario;
import rpg.dominio.Pocao;

public class InventarioTest01 {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";

        heroi.inventario = new Inventario();
        heroi.inventario.pocoes = new Pocao[10];

        Arma arma = new Arma();
        arma.nome = "Espada de Ferro";
        arma.bonusAtaque = 8;

        heroi.inventario.armaEquipada = arma;

        Pocao pocao = new Pocao();
        pocao.nome = "Poção Pequena";
        pocao.pontosCura = 20;

        heroi.inventario.pocoes[0] = pocao;
        heroi.inventario.quantidadePocoes = 1;

        System.out.println("Herói: " + heroi.nome);
        System.out.println("Arma equipada: " +
                heroi.inventario.armaEquipada.nome);
        System.out.println("Quantidade de poções: " +
                heroi.inventario.quantidadePocoes);
    }
}