package Arrays;

import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int pares = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println("\nQuantidade de números pares: " + pares);

        entrada.close();
    }
}