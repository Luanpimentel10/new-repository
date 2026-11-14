package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite o multiplicador: ");
        int multiplicador = scanner.nextInt();

        System.out.println("\n--- Resultado ---");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] * multiplicador);
        }

        scanner.close();
    }
}