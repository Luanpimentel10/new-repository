package rpg.test;

import rpg.dominio.Monstro;

public class MonstroTest02 {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.nome = "Goblin";
        monstro.vida = 30;

        System.out.println("Monstro: " + monstro.nome);
        System.out.println("Está vivo? " + monstro.estaVivo());

        monstro.vida = 0;

        System.out.println("Está vivo após perder toda a vida? "
                + monstro.estaVivo());
    }
}