package rpg.test;

import rpg.dominio.Batalha;
import rpg.dominio.CadastroHeroi;
import rpg.dominio.CadastroMonstro;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;

import java.util.Scanner;

public class BatalhaTest05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CadastroHeroi cadastroHeroi = new CadastroHeroi();
        CadastroMonstro cadastroMonstro = new CadastroMonstro();

        Heroi heroi = cadastroHeroi.cadastrar("Arthur");
        Monstro monstro = cadastroMonstro.cadastrar("Goblin");

        Batalha batalha = new Batalha();

        System.out.println("=== BATALHA RPG ===");
        System.out.println("Um " + monstro.nome + " apareceu!");

        while (heroi.estaVivo() && monstro.estaVivo()) {

            System.out.println("\nVida do herói: " + heroi.vida);
            System.out.println("Vida do monstro: " + monstro.vida);

            System.out.println("\n1 - Atacar");
            System.out.println("2 - Fugir");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();

            if (opcao == 1) {

                batalha.executarTurno(heroi, monstro);

            } else if (opcao == 2) {

                System.out.println("Você fugiu da batalha!");
                break;

            } else {

                System.out.println("Opção inválida!");
            }
        }

        if (!monstro.estaVivo()) {
            batalha.entregarRecompensa(heroi, monstro);
        }

        if (!heroi.estaVivo()) {
            System.out.println("Game Over!");
        }

        System.out.println("\n=== FIM DA BATALHA ===");
        System.out.println(heroi.gerarResumo());

        scanner.close();
    }
}