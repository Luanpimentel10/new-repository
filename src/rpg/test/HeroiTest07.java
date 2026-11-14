package rpg.test;

import rpg.dominio.Heroi;

public class HeroiTest07 {
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

        System.out.println(heroi.gerarResumo());
    }
}