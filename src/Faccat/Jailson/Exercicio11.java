package Flamingo.aprendendo.logica;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de carros vendidos: ");
        int quantidadeCarros = entrada.nextInt();

        System.out.print("Valor total das vendas: R$ ");
        double valorVendas = entrada.nextDouble();

        System.out.print("Salário fixo: R$ ");
        double salarioFixo = entrada.nextDouble();

        System.out.print("Comissão por carro vendido: R$ ");
        double comissaoPorCarro = entrada.nextDouble();

        double comissaoTotal = quantidadeCarros * comissaoPorCarro;

        double bonusVendas = valorVendas * 0.05;

        double salarioFinal = salarioFixo + comissaoTotal + bonusVendas;

        System.out.printf("Comissão por carros: R$ %.2f%n", comissaoTotal);
        System.out.printf("Comissão sobre vendas: R$ %.2f%n", bonusVendas);
        System.out.printf("Salário final: R$ %.2f%n", salarioFinal);

        entrada.close();
    }
}