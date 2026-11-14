package rpg.test;

import rpg.dominio.Heroi;

public class HeroiTest02 {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";
        heroi.vida = 100;

        System.out.println("Herói: " + heroi.nome);
        System.out.println("Está vivo? " + heroi.estaVivo());

        heroi.vida = 0;

        System.out.println("Está vivo após perder toda a vida? "
                + heroi.estaVivo());
    }
}