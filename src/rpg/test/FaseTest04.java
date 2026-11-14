package rpg.test;

import rpg.dominio.Batalha;
import rpg.dominio.CadastroHeroi;
import rpg.dominio.CadastroMonstro;
import rpg.dominio.Fase;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;

public class FaseTest04 {

    public static void main(String[] args) {

        CadastroHeroi cadastroHeroi = new CadastroHeroi();
        CadastroMonstro cadastroMonstro = new CadastroMonstro();

        Heroi heroi = cadastroHeroi.cadastrar("Arthur");

        Fase fase = new Fase();
        fase.nome = "Floresta Sombria";
        fase.monstros = new Monstro[2];

        fase.monstros[0] = cadastroMonstro.cadastrar("Goblin");
        fase.monstros[1] = cadastroMonstro.cadastrar("Esqueleto");

        System.out.println("=== FASE: " + fase.nome + " ===");

        for (int i = 0; i < fase.monstros.length; i++) {

            Monstro monstro = fase.monstros[i];
            Batalha batalha = new Batalha();

            System.out.println("\nUm " + monstro.nome + " apareceu!");

            while (heroi.estaVivo() && monstro.estaVivo()) {
                batalha.executarTurno(heroi, monstro);
            }

            if (heroi.estaVivo()) {
                batalha.entregarRecompensa(heroi, monstro);
            } else {
                System.out.println("Game Over!");
                break;
            }
        }

        System.out.println("\n=== STATUS FINAL ===");
        System.out.println(heroi.gerarResumo());
    }
}