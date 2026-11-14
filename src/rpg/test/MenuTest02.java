package rpg.test;

import rpg.dominio.CadastroHeroi;
import rpg.dominio.Heroi;

import java.util.Scanner;

public class MenuTest02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CadastroHeroi cadastro = new CadastroHeroi();
        Heroi heroi = cadastro.cadastrar("Arthur");

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n=== MENU RPG ===");
            System.out.println("1 - Ver personagem");
            System.out.println("2 - Ver ouro e experiência");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println(heroi.gerarResumo());
                    break;

                case 2:
                    System.out.println("Ouro: " + heroi.ouro);
                    System.out.println("Experiência: " + heroi.experiencia);
                    break;

                case 3:
                    System.out.println("Saindo do jogo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}