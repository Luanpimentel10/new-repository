package rpg.test;

import rpg.dominio.CadastroHeroi;
import rpg.dominio.CadastroMonstro;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;
import rpg.dominio.Batalha;

import java.util.Scanner;

public class JogoTest05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CadastroHeroi cadastroHeroi = new CadastroHeroi();
        CadastroMonstro cadastroMonstro = new CadastroMonstro();

        System.out.println("=== JORNADA DE ELDORIA ===");
        System.out.print("Digite o nome do herói: ");

        String nome = scanner.nextLine();

        Heroi heroi = cadastroHeroi.cadastrar(nome);

        System.out.println("\nBem-vindo, " + heroi.nome + "!");
        System.out.println("Sua aventura começou!");

        Monstro monstro = cadastroMonstro.cadastrar("Goblin");

        System.out.println("\nUm " + monstro.nome + " apareceu!");

        Batalha batalha = new Batalha();

        while (heroi.estaVivo() && monstro.estaVivo()) {

            System.out.println("\n1 - Atacar");
            System.out.println("2 - Fugir");
            System.out.print("Escolha: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Digite apenas números!");
                scanner.next();
                continue;
            }

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
            System.out.println("Você foi derrotado!");
        }

        System.out.println("\n=== FIM DA AVENTURA ===");
        System.out.println(heroi.gerarResumo());

        scanner.close();
    }
}
