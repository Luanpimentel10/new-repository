package rpg.test;

import rpg.dominio.Batalha;
import rpg.dominio.CadastroHeroi;
import rpg.dominio.CadastroMonstro;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;

public class JogoTest03 {

    public static void main(String[] args) {

        CadastroHeroi cadastroHeroi = new CadastroHeroi();
        CadastroMonstro cadastroMonstro = new CadastroMonstro();

        Heroi heroi = cadastroHeroi.cadastrar("Arthur");
        Monstro monstro = cadastroMonstro.cadastrar("Goblin");

        Batalha batalha = new Batalha();

        System.out.println("=== RPG: A JORNADA DE ELDORIA ===");
        System.out.println("Herói: " + heroi.nome);
        System.out.println("Um " + monstro.nome + " apareceu!");

        while (heroi.estaVivo() && monstro.estaVivo()) {

            batalha.executarTurno(heroi, monstro);

            System.out.println("-------------------------");
        }

        if (heroi.estaVivo()) {
            batalha.entregarRecompensa(heroi, monstro);
            System.out.println("Você venceu a batalha!");
        } else {
            System.out.println("Game Over! Você foi derrotado.");
        }

        System.out.println("\n=== STATUS FINAL ===");
        System.out.println(heroi.gerarResumo());
    }
}