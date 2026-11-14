package Arrays;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[6];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idades[i] = scanner.nextInt();
        }

        System.out.println("\n--- IDADES CADASTRADAS ---");

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        scanner.close();
    }
}