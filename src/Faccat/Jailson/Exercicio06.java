package Flamingo.aprendendo.logica;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = entrada.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;

        System.out.println("Área do retângulo: " + area);

        entrada.close();
    }
}