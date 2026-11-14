package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray39 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Diagonal principal ---");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }

        scanner.close();
    }
}