package Arrays;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;
        double media;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();

            soma += notas[i];
        }

        media = soma / notas.length;

        System.out.println("A média final é: " + media);

        scanner.close();
    }
}