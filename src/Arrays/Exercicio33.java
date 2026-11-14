package Arrays;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        int maior = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("\nMaior elemento da matriz: " + maior);

        entrada.close();
    }
}