package rpg.test;

import java.util.Scanner;

public class MenuTest03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n=== MENU DE ELDORIA ===");
            System.out.println("1 - Iniciar jogo");
            System.out.println("2 - Ver informações");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            if (scanner.hasNextInt()) {

                opcao = scanner.nextInt();

                switch (opcao) {

                    case 1:
                        System.out.println("Iniciando aventura...");
                        break;

                    case 2:
                        System.out.println("Bem-vindo ao mundo de Eldoria!");
                        break;

                    case 3:
                        System.out.println("Saindo do jogo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } else {
                System.out.println("Digite apenas números!");
                scanner.next();
            }
        }

        scanner.close();
    }
}