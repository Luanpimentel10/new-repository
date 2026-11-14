package Arrays;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];
        int[] dobro = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

            dobro[i] = numeros[i] * 2;
        }

        System.out.println("\nArray original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\nArray com o dobro:");
        for (int i = 0; i < dobro.length; i++) {
            System.out.println(dobro[i]);
        }

        entrada.close();
    }
}