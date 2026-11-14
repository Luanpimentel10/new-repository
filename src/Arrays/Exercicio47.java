package Arrays;

import java.util.Scanner;

public class Exercicio47 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.print("Digite o multiplicador: ");
        int multiplicador = entrada.nextInt();

        System.out.println("\nMatriz multiplicada:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matriz[i][j] * multiplicador) + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}