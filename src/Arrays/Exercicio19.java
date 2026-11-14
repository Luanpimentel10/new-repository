package Arrays;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        int auxiliar = numeros[0];
        numeros[0] = numeros[numeros.length - 1];
        numeros[numeros.length - 1] = auxiliar;

        System.out.println("\nArray após a troca:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}