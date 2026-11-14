package Arrays;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[8];
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

            if (notas[i] >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        System.out.println("\nAprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        entrada.close();
    }
}