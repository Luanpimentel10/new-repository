package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Quantidade de números pares: " + contador);

        scanner.close();
    }
}