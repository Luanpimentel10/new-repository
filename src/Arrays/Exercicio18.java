package Arrays;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[6];
        double maior, menor, soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

            soma += notas[i];
        }

        maior = notas[0];
        menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double media = soma / notas.length;

        System.out.println("\nMaior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Média: " + media);

        entrada.close();
    }
}