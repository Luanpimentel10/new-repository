package rpg.test;

import rpg.dominio.Monstro;

public class MonstroTest01 {

    public static void main(String[] args) {

        Monstro monstro1 = new Monstro();

        monstro1.nome = "Goblin";
        monstro1.vida = 30;
        monstro1.ataque = 6;
        monstro1.defesa = 1;
        monstro1.ouroRecompensa = 10;
        monstro1.experienciaRecompensa = 20;

        Monstro monstro2 = new Monstro();

        monstro2.nome = "Esqueleto";
        monstro2.vida = 45;
        monstro2.ataque = 9;
        monstro2.defesa = 2;
        monstro2.ouroRecompensa = 20;
        monstro2.experienciaRecompensa = 35;

        Monstro monstro3 = new Monstro();

        monstro3.nome = "Guardião Sombrio";
        monstro3.vida = 75;
        monstro3.ataque = 12;
        monstro3.defesa = 3;
        monstro3.ouroRecompensa = 50;
        monstro3.experienciaRecompensa = 100;

        System.out.println("=== MONSTRO 1 ===");
        System.out.println("Nome: " + monstro1.nome);
        System.out.println("Vida: " + monstro1.vida);
        System.out.println("Ataque: " + monstro1.ataque);
        System.out.println("Defesa: " + monstro1.defesa);
        System.out.println("Ouro: " + monstro1.ouroRecompensa);
        System.out.println("Experiência: " + monstro1.experienciaRecompensa);

        System.out.println("\n=== MONSTRO 2 ===");
        System.out.println("Nome: " + monstro2.nome);
        System.out.println("Vida: " + monstro2.vida);
        System.out.println("Ataque: " + monstro2.ataque);
        System.out.println("Defesa: " + monstro2.defesa);
        System.out.println("Ouro: " + monstro2.ouroRecompensa);
        System.out.println("Experiência: " + monstro2.experienciaRecompensa);

        System.out.println("\n=== MONSTRO 3 ===");
        System.out.println("Nome: " + monstro3.nome);
        System.out.println("Vida: " + monstro3.vida);
        System.out.println("Ataque: " + monstro3.ataque);
        System.out.println("Defesa: " + monstro3.defesa);
        System.out.println("Ouro: " + monstro3.ouroRecompensa);
        System.out.println("Experiência: " + monstro3.experienciaRecompensa);
    }
}