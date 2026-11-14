package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o número que deseja pesquisar: ");
        int pesquisar = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == pesquisar) {
                contador++;
            }
        }

        System.out.println("\nO número apareceu " + contador + " vezes.");

        scanner.close();
    }
}