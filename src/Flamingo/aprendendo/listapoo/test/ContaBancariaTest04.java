package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest04 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Luan";
        conta.saldo = 1000;

        System.out.println("Saldo antes: R$ " + conta.saldo);

        conta.depositar(500);

        System.out.println("Saldo depois: R$ " + conta.saldo);

    }
}