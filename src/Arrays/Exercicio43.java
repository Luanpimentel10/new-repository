package Arrays;

import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();

                if (matriz[i][j] > 0) {
                    positivos++;
                } else if (matriz[i][j] < 0) {
                    negativos++;
                } else {
                    zeros++;
                }
            }
        }

        System.out.println("\nPositivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);

        entrada.close();
    }
}