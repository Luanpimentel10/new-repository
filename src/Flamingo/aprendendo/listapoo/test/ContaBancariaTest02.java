package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest02 {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        conta1.titular = "Luan";
        conta1.saldo = 2500;

        conta2.titular = "Carlos";
        conta2.saldo = 0;

        System.out.println(conta1.titular + ": " + conta1.temSaldo());
        System.out.println(conta2.titular + ": " + conta2.temSaldo());

    }
}