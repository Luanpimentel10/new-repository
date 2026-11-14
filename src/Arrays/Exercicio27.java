package Arrays;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[6];
        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();

            if (nomes[i].toUpperCase().startsWith("A")) {
                contador++;
            }
        }

        System.out.println("\nNomes que começam com A: " + contador);

        entrada.close();
    }
}