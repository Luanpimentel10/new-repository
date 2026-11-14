package rpg.test;

import rpg.dominio.Monstro;

public class MonstroTest04 {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.nome = "Goblin";
        monstro.vida = 30;

        System.out.println("Vida inicial: " + monstro.vida);

        monstro.receberDano(10);

        System.out.println("Após receber 10 de dano: " + monstro.vida);

        monstro.receberDano(50);

        System.out.println("Após receber 50 de dano: " + monstro.vida);
        System.out.println("Está vivo? " + monstro.estaVivo());
    }
}