package Arrays;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();

                soma += matriz[i][j];
            }
        }

        System.out.println("\nSoma de todos os elementos: " + soma);

        entrada.close();
    }
}