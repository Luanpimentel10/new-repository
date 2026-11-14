package Arrays;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] soma = new int[5];

        System.out.println("Primeiro array:");

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array1[i] = entrada.nextInt();
        }

        System.out.println("\nSegundo array:");

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array2[i] = entrada.nextInt();
        }

        for (int i = 0; i < soma.length; i++) {
            soma[i] = array1[i] + array2[i];
        }

        System.out.println("\nArray da soma:");

        for (int i = 0; i < soma.length; i++) {
            System.out.println(soma[i]);
        }

        entrada.close();
    }
}