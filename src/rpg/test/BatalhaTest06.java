package rpg.test;

import rpg.dominio.Batalha;
import rpg.dominio.CadastroHeroi;
import rpg.dominio.CadastroMonstro;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;
import rpg.dominio.Pocao;

import java.util.Scanner;

public class BatalhaTest06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CadastroHeroi cadastroHeroi = new CadastroHeroi();
        CadastroMonstro cadastroMonstro = new CadastroMonstro();

        Heroi heroi = cadastroHeroi.cadastrar("Arthur");
        Monstro monstro = cadastroMonstro.cadastrar("Goblin");

        Pocao pocao = new Pocao();
        pocao.nome = "Poção Pequena";
        pocao.pontosCura = 30;

        heroi.inventario.pocoes[0] = pocao;
        heroi.inventario.quantidadePocoes = 1;
        heroi.vida = 50;

        Batalha batalha = new Batalha();

        while (heroi.estaVivo() && monstro.estaVivo()) {

            System.out.println("\n=== BATALHA ===");
            System.out.println("Vida do herói: " + heroi.vida);
            System.out.println("Vida do monstro: " + monstro.vida);

            System.out.println("\n1 - Atacar");
            System.out.println("2 - Usar poção");
            System.out.println("3 - Fugir");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();

            if (opcao == 1) {

                batalha.executarTurno(heroi, monstro);

            } else if (opcao == 2) {

                if (heroi.usarPocao(0)) {
                    System.out.println("Poção utilizada!");
                } else {
                    System.out.println("Você não possui poções!");
                }

            } else if (opcao == 3) {

                System.out.println("Você fugiu!");
                break;

            } else {

                System.out.println("Opção inválida!");
            }
        }

        if (!monstro.estaVivo()) {
            batalha.entregarRecompensa(heroi, monstro);
        }

        System.out.println("\n=== STATUS FINAL ===");
        System.out.println(heroi.gerarResumo());

        scanner.close();
    }
}