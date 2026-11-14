package Arrays;

import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nDiagonal principal:");

        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][i]);
        }

        entrada.close();
    }
}