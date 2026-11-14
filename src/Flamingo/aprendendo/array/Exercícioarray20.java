package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];

        boolean repetido = false;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] == numeros[j]) {
                    repetido = true;
                }
            }
        }

        System.out.println("\n--- Resultado ---");

        if (repetido) {
            System.out.println("Existem números repetidos!");
        } else {
            System.out.println("Não existem números repetidos!");
        }

        scanner.close();
    }
}