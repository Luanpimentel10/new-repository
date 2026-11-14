package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] quantidades = new int[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();

            System.out.print("Digite a quantidade em estoque: ");
            quantidades[i] = scanner.nextInt();

            scanner.nextLine();
        }

        System.out.println("\n--- Produtos com estoque abaixo de 5 ---");

        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] < 5) {
                System.out.println("Produto: " + produtos[i]);
                System.out.println("Quantidade: " + quantidades[i]);
            }
        }

        scanner.close();
    }
}