package Arrays;

import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[][] notas = new double[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota do aluno " + (i + 1) + ", prova " + (j + 1) + ": ");
                notas[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            double soma = 0;

            for (int j = 0; j < 3; j++) {
                soma += notas[i][j];
            }

            System.out.println("Média do aluno " + (i + 1) + ": " + (soma / 3));
        }

        entrada.close();
    }
}