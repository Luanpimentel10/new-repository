package Arrays;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\nDobro dos números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] * 2);
        }

        entrada.close();
    }
}