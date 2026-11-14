package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray44 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nDigite o número que deseja pesquisar: ");
        int pesquisar = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == pesquisar) {
                    System.out.println("Encontrado na linha " + i + " e coluna " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado!");
        }

        scanner.close();
    }
}