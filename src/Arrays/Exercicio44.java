package Arrays;

import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.print("\nDigite o número que deseja buscar: ");
        int busca = entrada.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == busca) {
                    System.out.println("Encontrado na linha " + i + " e coluna " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }

        entrada.close();
    }
}