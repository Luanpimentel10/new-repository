package Arrays;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();

            System.out.print("Digite a nota: ");
            notas[i] = entrada.nextDouble();
            entrada.nextLine();
        }

        System.out.println("\nResultado dos alunos:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\nNome: " + nomes[i]);
            System.out.println("Nota: " + notas[i]);

            if (notas[i] >= 7) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }

        entrada.close();
    }
}