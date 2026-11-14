package rpg.test;

import rpg.dominio.Heroi;

public class HeroiTest05 {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";
        heroi.vida = 100;

        System.out.println("Vida inicial: " + heroi.vida);

        heroi.receberDano(30);

        System.out.println("Após receber 30 de dano: " + heroi.vida);

        heroi.receberDano(100);

        System.out.println("Após receber 100 de dano: " + heroi.vida);
        System.out.println("Está vivo? " + heroi.estaVivo());
    }
}