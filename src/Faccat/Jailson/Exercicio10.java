package Flamingo.aprendendo.logica;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = entrada.nextDouble();

        double distribuidor = custoFabrica * 0.28;
        double impostos = custoFabrica * 0.45;

        double custoFinal = custoFabrica + distribuidor + impostos;

        System.out.printf("Custo de fábrica: R$ %.2f%n", custoFabrica);
        System.out.printf("Distribuidor: R$ %.2f%n", distribuidor);
        System.out.printf("Impostos: R$ %.2f%n", impostos);
        System.out.printf("Custo final: R$ %.2f%n", custoFinal);

        entrada.close();
    }
}