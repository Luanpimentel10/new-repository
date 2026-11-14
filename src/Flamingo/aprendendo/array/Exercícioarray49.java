package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray49 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] vendas = new double[3][4];

        double[] totais = new double[3];

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print("Digite a venda " + (j + 1) + " do vendedor " + (i + 1) + ": ");
                vendas[i][j] = scanner.nextDouble();

                totais[i] += vendas[i][j];
            }
        }

        int maiorVendedor = 0;

        for (int i = 1; i < totais.length; i++) {
            if (totais[i] > totais[maiorVendedor]) {
                maiorVendedor = i;
            }
        }

        System.out.println("\n--- Total por vendedor ---");

        for (int i = 0; i < totais.length; i++) {
            System.out.println("Vendedor " + (i + 1) + ": R$ " + totais[i]);
        }

        System.out.println("\nVendedor que mais vendeu: " + (maiorVendedor + 1));
        System.out.println("Total vendido: R$ " + totais[maiorVendedor]);

        scanner.close();
    }
}