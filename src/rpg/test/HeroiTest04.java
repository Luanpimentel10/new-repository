package rpg.test;

import rpg.dominio.Arma;
import rpg.dominio.Heroi;
import rpg.dominio.Inventario;

public class HeroiTest04 {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";
        heroi.ataque = 15;
        heroi.inventario = new Inventario();

        Arma arma = new Arma();
        arma.nome = "Espada de Ferro";
        arma.bonusAtaque = 8;

        heroi.inventario.armaEquipada = arma;

        int dano = heroi.calcularDano(5);

        System.out.println("Herói: " + heroi.nome);
        System.out.println("Ataque total: " + heroi.calcularAtaqueTotal());
        System.out.println("Defesa do inimigo: 5");
        System.out.println("Dano causado: " + dano);
    }
}