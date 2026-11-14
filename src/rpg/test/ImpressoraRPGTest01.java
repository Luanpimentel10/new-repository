package rpg.test;

import rpg.dominio.Heroi;
import rpg.dominio.Monstro;
import rpg.dominio.ImpressoraRPG;

public class ImpressoraRPGTest01 {

    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";
        heroi.vida = 100;
        heroi.vidaMaxima = 100;
        heroi.ataque = 15;
        heroi.defesa = 5;
        heroi.nivel = 1;
        heroi.experiencia = 20;
        heroi.ouro = 30;

        Monstro monstro = new Monstro();
        monstro.nome = "Goblin";
        monstro.vida = 30;
        monstro.ataque = 6;
        monstro.defesa = 1;
        monstro.ouroRecompensa = 10;
        monstro.experienciaRecompensa = 20;

        ImpressoraRPG impressora = new ImpressoraRPG();

        impressora.imprimirHeroi(heroi);

        System.out.println();

        impressora.imprimirMonstro(monstro);
    }
}