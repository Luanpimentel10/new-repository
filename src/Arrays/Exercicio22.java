package Arrays;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Primeiro array:");

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array1[i] = entrada.nextInt();
        }

        System.out.println("\nSegundo array:");

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array2[i] = entrada.nextInt();
        }

        boolean iguais = true;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                iguais = false;
                break;
            }
        }

        if (iguais) {
            System.out.println("\nOs arrays são iguais.");
        } else {
            System.out.println("\nOs arrays são diferentes.");
        }

        entrada.close();
    }
}