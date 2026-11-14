package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
        }

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Buscar produto");
            System.out.println("3 - Quantidade de produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(produtos[i]);
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String pesquisar = scanner.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i].equalsIgnoreCase(pesquisar)) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        System.out.println("Produto encontrado!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("Quantidade de produtos: " + produtos.length);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}