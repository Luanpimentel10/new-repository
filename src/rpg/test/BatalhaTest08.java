package rpg.test;

import rpg.dominio.CadastroHeroi;
import rpg.dominio.CadastroMonstro;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;
import rpg.dominio.Batalha;

public class BatalhaTest08 {

    public static void main(String[] args) {

        CadastroHeroi cadastroHeroi = new CadastroHeroi();
        CadastroMonstro cadastroMonstro = new CadastroMonstro();

        Heroi heroi = cadastroHeroi.cadastrar("Arthur");
        Monstro monstro = cadastroMonstro.cadastrar("Goblin");

        Batalha batalha = new Batalha();

        System.out.println("=== INÍCIO DA BATALHA ===");

        while (heroi.estaVivo() && monstro.estaVivo()) {

            batalha.executarTurno(heroi, monstro);

            System.out.println("----------------------");
        }

        if (heroi.estaVivo()) {
            batalha.entregarRecompensa(heroi, monstro);
            System.out.println("Arthur venceu a batalha!");
        } else {
            System.out.println("Arthur foi derrotado!");
        }

        System.out.println("\n=== STATUS FINAL ===");
        System.out.println(heroi.gerarResumo());
    }
}