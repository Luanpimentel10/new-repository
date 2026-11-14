package Arrays;

import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int j = 0; j < 4; j++) {
            int soma = 0;

            for (int i = 0; i < 3; i++) {
                soma += matriz[i][j];
            }

            System.out.println("Soma da coluna " + (j + 1) + ": " + soma);
        }

        entrada.close();
    }
}