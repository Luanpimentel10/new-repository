package Arrays;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();
        }

        System.out.println("\nNomes com mais de 5 letras:");

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].length() > 5) {
                System.out.println(nomes[i]);
            }
        }

        entrada.close();
    }
}