package rpg.test;

import rpg.dominio.Monstro;

public class MonstroTest05 {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.nome = "Goblin";
        monstro.vida = 30;
        monstro.ataque = 6;
        monstro.defesa = 1;
        monstro.ouroRecompensa = 10;
        monstro.experienciaRecompensa = 20;

        System.out.println(monstro.gerarResumo());
    }
}