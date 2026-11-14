package rpg.test;

import rpg.dominio.Fase;
import rpg.dominio.Monstro;

public class FaseTest01 {
    public static void main(String[] args) {

        Monstro goblin = new Monstro();
        goblin.nome = "Goblin";
        goblin.vida = 30;
        goblin.ataque = 6;
        goblin.defesa = 1;

        Fase fase = new Fase();
        fase.nome = "Floresta Sombria";
        fase.monstro = goblin;

        System.out.println("=== FASE ===");
        System.out.println("Nome: " + fase.nome);
        System.out.println("Monstro: " + fase.monstro.nome);
        System.out.println("Vida do monstro: " + fase.monstro.vida);
        System.out.println("Ataque: " + fase.monstro.ataque);
        System.out.println("Defesa: " + fase.monstro.defesa);
    }
}