package Arrays;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Digite o número que deseja pesquisar:");
        int pesquisa = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == pesquisa) {
                contador++;
            }
        }

        System.out.println("O número " + pesquisa + " aparece " + contador + " vezes.");

        scanner.close();
    }
}