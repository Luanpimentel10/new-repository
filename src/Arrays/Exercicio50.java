package Arrays;

import java.util.Scanner;

public class Exercicio50 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] estoque = new int[3][5];

        int maiorEstoque = 0;
        int lojaMaiorEstoque = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Loja " + (i + 1) + ", produto " + (j + 1) + ": ");
                estoque[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nTotal por loja:");

        for (int i = 0; i < 3; i++) {
            int total = 0;

            for (int j = 0; j < 5; j++) {
                total += estoque[i][j];
            }

            System.out.println("Loja " + (i + 1) + ": " + total);

            if (i == 0 || total > maiorEstoque) {
                maiorEstoque = total;
                lojaMaiorEstoque = i + 1;
            }
        }

        System.out.println("\nTotal por produto:");

        for (int j = 0; j < 5; j++) {
            int total = 0;

            for (int i = 0; i < 3; i++) {
                total += estoque[i][j];
            }

            System.out.println("Produto " + (j + 1) + ": " + total);
        }

        System.out.println("\nLoja com maior estoque total: " + lojaMaiorEstoque);
        System.out.println("Quantidade total: " + maiorEstoque);

        entrada.close();
    }
}