package Arrays;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;
        double media;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();

            soma += notas[i];
        }

        media = soma / notas.length;

        System.out.println("\nMédia da turma: " + media);
        System.out.println("\nNotas acima da média:");

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }

        scanner.close();
    }
}