package Arrays;

import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            int auxiliar = matriz[0][j];
            matriz[0][j] = matriz[2][j];
            matriz[2][j] = auxiliar;
        }

        System.out.println("\nMatriz após a troca:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}