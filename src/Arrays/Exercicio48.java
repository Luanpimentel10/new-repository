package Arrays;

import java.util.Scanner;

public class Exercicio48 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[2][3];
        int[][] transposta = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();

                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz transposta:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}