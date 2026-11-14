package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("\n--- Resultado ---");
        System.out.println("A média final é: " + media);

        scanner.close();
    }
}