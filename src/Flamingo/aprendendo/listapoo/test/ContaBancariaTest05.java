package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest05 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Luan";
        conta.saldo = 1000;

        System.out.println("Saldo inicial: R$ " + conta.saldo);

        conta.sacar(300);
        System.out.println("Saldo após saque: R$ " + conta.saldo);

        conta.sacar(1000);
        System.out.println("Saldo final: R$ " + conta.saldo);

    }
}