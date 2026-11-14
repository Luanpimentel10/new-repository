package Arrays;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Digite o multiplicador: ");
        int multiplicador = entrada.nextInt();

        System.out.println("\nResultados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] * multiplicador);
        }

        entrada.close();
    }
}