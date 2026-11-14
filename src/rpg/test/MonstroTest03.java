package rpg.test;

import rpg.dominio.Monstro;

public class MonstroTest03 {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.nome = "Goblin";
        monstro.ataque = 10;

        int dano = monstro.calcularDano(4);

        System.out.println("Monstro: " + monstro.nome);
        System.out.println("Ataque: " + monstro.ataque);
        System.out.println("Defesa do herói: 4");
        System.out.println("Dano causado: " + dano);
    }
}
