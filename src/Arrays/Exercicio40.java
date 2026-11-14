package Arrays;

import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            soma += matriz[i][i];
        }

        System.out.println("\nSoma da diagonal principal: " + soma);

        entrada.close();
    }
}