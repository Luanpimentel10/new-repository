package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray38 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        for (int i = 0; i < nomes.length; i++) {

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }

            scanner.nextLine();
        }

        System.out.println("\n--- Boletim dos alunos ---");

        for (int i = 0; i < nomes.length; i++) {

            double soma = 0;

            System.out.println("\nNome: " + nomes[i]);

            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
                soma += notas[i][j];
            }

            double media = soma / notas[i].length;

            System.out.println("Média: " + media);

            if (media >= 7) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }

        scanner.close();
    }
}