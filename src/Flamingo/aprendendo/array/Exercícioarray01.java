package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\n--- Alunos cadastrados ---");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        scanner.close();
    }
}