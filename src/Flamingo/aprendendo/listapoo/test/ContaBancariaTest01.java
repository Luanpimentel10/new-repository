package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest01 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Luan";
        conta.numeroConta = 12345;
        conta.saldo = 2500.00;

        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da conta: " + conta.numeroConta);
        System.out.println("Saldo: R$ " + conta.saldo);

    }
}