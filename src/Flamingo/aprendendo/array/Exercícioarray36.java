package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray36 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Soma de cada coluna ---");

        for (int j = 0; j < matriz[0].length; j++) {

            int somaColuna = 0;

            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
            }

            System.out.println("Coluna " + j + ": " + somaColuna);
        }

        scanner.close();
    }
}