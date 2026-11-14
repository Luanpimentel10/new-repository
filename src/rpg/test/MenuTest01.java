package rpg.test;

import java.util.Scanner;

public class MenuTest01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n=== MENU RPG ===");
            System.out.println("1 - Iniciar jogo");
            System.out.println("2 - Ver personagem");
            System.out.println("3 - Ver inventário");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Iniciando jogo...");
                    break;

                case 2:
                    System.out.println("Exibindo personagem...");
                    break;

                case 3:
                    System.out.println("Exibindo inventário...");
                    break;

                case 4:
                    System.out.println("Saindo do jogo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}