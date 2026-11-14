package rpg.test;

import rpg.dominio.Heroi;

public class HeroiTest06 {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";
        heroi.vida = 50;
        heroi.vidaMaxima = 100;

        System.out.println("Vida inicial: " + heroi.vida);

        heroi.curar(30);
        System.out.println("Após curar 30: " + heroi.vida);

        heroi.curar(50);
        System.out.println("Após curar 50: " + heroi.vida);
    }
}