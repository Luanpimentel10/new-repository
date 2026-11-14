package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest03 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Luan";
        conta.saldo = 1500;

        System.out.println("Saldo disponível: R$ " + conta.saldo);
        System.out.println("Pode sacar R$ 1000? " + conta.podeSacar(1000));
        System.out.println("Pode sacar R$ 2000? " + conta.podeSacar(2000));

    }
}