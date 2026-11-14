package Arrays;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[6];
        boolean duplicado = false;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    duplicado = true;
                }
            }
        }

        if (duplicado) {
            System.out.println("\nExistem números duplicados.");
        } else {
            System.out.println("\nNão existem números duplicados.");
        }

        entrada.close();
    }
}