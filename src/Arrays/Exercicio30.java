package Arrays;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] estoque = new int[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = entrada.nextLine();

            System.out.print("Digite a quantidade em estoque: ");
            estoque[i] = entrada.nextInt();
            entrada.nextLine();
        }

        System.out.println("\nProdutos com estoque menor que 5:");

        for (int i = 0; i < produtos.length; i++) {
            if (estoque[i] < 5) {
                System.out.println(produtos[i] + " - Estoque: " + estoque[i]);
            }
        }

        entrada.close();
    }
}