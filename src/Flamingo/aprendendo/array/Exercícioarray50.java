package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray50 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] estoque = new int[3][5];

        int[] totalLojas = new int[3];

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {

                System.out.print("Digite a quantidade do produto " + (j + 1) +
                        " na loja " + (i + 1) + ": ");

                estoque[i][j] = scanner.nextInt();

                totalLojas[i] += estoque[i][j];
            }
        }

        System.out.println("\n--- Total de produtos por loja ---");

        for (int i = 0; i < totalLojas.length; i++) {
            System.out.println("Loja " + (i + 1) + ": " + totalLojas[i]);
        }

        System.out.println("\n--- Total por produto ---");

        for (int j = 0; j < estoque[0].length; j++) {

            int totalProduto = 0;

            for (int i = 0; i < estoque.length; i++) {
                totalProduto += estoque[i][j];
            }

            System.out.println("Produto " + (j + 1) + ": " + totalProduto);
        }

        int maiorLoja = 0;

        for (int i = 1; i < totalLojas.length; i++) {
            if (totalLojas[i] > totalLojas[maiorLoja]) {
                maiorLoja = i;
            }
        }

        System.out.println("\nLoja com maior estoque: Loja " + (maiorLoja + 1));
        System.out.println("Total de produtos: " + totalLojas[maiorLoja]);

        scanner.close();
    }
}