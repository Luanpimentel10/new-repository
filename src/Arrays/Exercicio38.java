package Arrays;

import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = entrada.nextDouble();
            }

            entrada.nextLine();
        }

        for (int i = 0; i < 4; i++) {
            double soma = 0;

            System.out.println("\nAluno: " + nomes[i]);

            for (int j = 0; j < 3; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
                soma += notas[i][j];
            }

            double media = soma / 3;

            System.out.println("Média: " + media);

            if (media >= 7) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }

        entrada.close();
    }
}