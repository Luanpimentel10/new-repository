package rpg.test;

import rpg.dominio.Arma;
import rpg.dominio.Heroi;
import rpg.dominio.Inventario;

public class HeroiTest03 {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";
        heroi.ataque = 15;

        heroi.inventario = new Inventario();

        Arma arma = new Arma();
        arma.nome = "Espada de Ferro";
        arma.bonusAtaque = 8;

        heroi.inventario.armaEquipada = arma;

        System.out.println("Herói: " + heroi.nome);
        System.out.println("Ataque base: " + heroi.ataque);
        System.out.println("Arma: " + arma.nome);
        System.out.println("Bônus da arma: " + arma.bonusAtaque);
        System.out.println("Ataque total: " + heroi.calcularAtaqueTotal());
    }
}