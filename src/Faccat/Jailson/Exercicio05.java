package Flamingo.aprendendo.logica;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int antecessor = numero - 1;

        System.out.println("Antecessor: " + antecessor);

        entrada.close();
    }
}