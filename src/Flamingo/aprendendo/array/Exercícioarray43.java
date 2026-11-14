package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray43 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] > 0) {
                    positivos++;
                } else if (matriz[i][j] < 0) {
                    negativos++;
                } else {
                    zeros++;
                }
            }
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);

        scanner.close();
    }
}