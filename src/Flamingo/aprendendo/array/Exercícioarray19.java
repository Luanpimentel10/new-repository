package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int temporario = numeros[0];

        numeros[0] = numeros[numeros.length - 1];

        numeros[numeros.length - 1] = temporario;

        System.out.println("\n--- Array alterado ---");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}