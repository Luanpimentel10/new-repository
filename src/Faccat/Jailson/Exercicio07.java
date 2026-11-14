package Flamingo.aprendendo.logica;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = entrada.nextInt();

        System.out.print("Digite os meses: ");
        int meses = entrada.nextInt();

        System.out.print("Digite os dias: ");
        int dias = entrada.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Sua idade em dias é: " + totalDias);

        entrada.close();
    }
}