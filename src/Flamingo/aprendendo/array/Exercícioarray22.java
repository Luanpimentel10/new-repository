package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        boolean iguais = true;

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite o número do primeiro array: ");
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Digite o número do segundo array: ");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                iguais = false;
            }
        }

        System.out.println("\n--- Resultado ---");

        if (iguais) {
            System.out.println("Os arrays são iguais!");
        } else {
            System.out.println("Os arrays são diferentes!");
        }

        scanner.close();
    }
}