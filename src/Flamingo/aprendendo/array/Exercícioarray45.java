package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray45 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < matriz[0].length; j++) {

            int temporario = matriz[0][j];

            matriz[0][j] = matriz[2][j];

            matriz[2][j] = temporario;
        }

        System.out.println("\n--- Matriz alterada ---");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}