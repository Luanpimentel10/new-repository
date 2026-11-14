package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray47 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nDigite o multiplicador: ");
        int multiplicador = scanner.nextInt();

        System.out.println("\n--- Matriz multiplicada ---");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print((matriz[i][j] * multiplicador) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}