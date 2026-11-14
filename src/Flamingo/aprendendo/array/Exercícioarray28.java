package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota do aluno: ");
            notas[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.println("\n--- Relatório de alunos ---");

        for (int i = 0; i < nomes.length; i++) {

            System.out.println("\nNome: " + nomes[i]);
            System.out.println("Nota: " + notas[i]);

            if (notas[i] >= 7) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }

        scanner.close();
    }
}