package rpg.test;

import rpg.dominio.Arma;
import rpg.dominio.Heroi;
import rpg.dominio.Inventario;
import rpg.dominio.Loja;

public class LojaTest02 {

    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";
        heroi.ouro = 100;
        heroi.ataque = 15;

        heroi.inventario = new Inventario();

        Arma arma = new Arma();
        arma.nome = "Espada de Ferro";
        arma.bonusAtaque = 10;
        arma.preco = 50;

        Loja loja = new Loja();

        System.out.println("Ouro inicial: " + heroi.ouro);

        boolean comprou = loja.comprarArma(heroi, arma);

        System.out.println("Compra realizada? " + comprou);
        System.out.println("Ouro restante: " + heroi.ouro);
        System.out.println("Arma equipada: " +
                heroi.inventario.armaEquipada.nome);
        System.out.println("Ataque total: " + heroi.calcularAtaqueTotal());
    }
}