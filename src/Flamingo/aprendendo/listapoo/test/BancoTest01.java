package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Banco;
import Flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class BancoTest01 {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Luan";
        conta1.saldo = 1500;

        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "Carlos";
        conta2.saldo = 500;

        Banco banco = new Banco();

        System.out.println("Saldo inicial de Luan: R$ " + conta1.saldo);
        System.out.println("Saldo inicial de Carlos: R$ " + conta2.saldo);

        banco.transferir(conta1, conta2, 500);

        System.out.println("-------------------");
        System.out.println("Saldo final de Luan: R$ " + conta1.saldo);
        System.out.println("Saldo final de Carlos: R$ " + conta2.saldo);

        banco.transferir(conta1, conta2, 2000);

    }
}