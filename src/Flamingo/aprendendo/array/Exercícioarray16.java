package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int[] dobros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            dobros[i] = numeros[i] * 2;
        }

        System.out.println("\n--- Valores dobrados ---");

        for (int i = 0; i < dobros.length; i++) {
            System.out.println(dobros[i]);
        }

        scanner.close();
    }
}