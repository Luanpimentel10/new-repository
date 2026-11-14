package Arrays;

import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[][] vendas = new double[3][4];
        double maiorTotal = 0;
        int melhorVendedor = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Vendedor " + (i + 1) + ", venda " + (j + 1) + ": ");
                vendas[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {
            double total = 0;

            for (int j = 0; j < 4; j++) {
                total += vendas[i][j];
            }

            System.out.println("Total do vendedor " + (i + 1) + ": " + total);

            if (i == 0 || total > maiorTotal) {
                maiorTotal = total;
                melhorVendedor = i + 1;
            }
        }

        System.out.println("\nVendedor com maior total: " + melhorVendedor);
        System.out.println("Total vendido: " + maiorTotal);

        entrada.close();
    }
}