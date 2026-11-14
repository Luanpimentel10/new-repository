package Flamingo.aprendendo.array;

import java.util.Scanner;

public class Exercícioarray27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[6];

        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].toUpperCase().charAt(0) == 'A') {
                contador++;
            }
        }

        System.out.println("\nQuantidade de nomes que começam com A: " + contador);

        scanner.close();
    }
}