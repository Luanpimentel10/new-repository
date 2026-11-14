package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Funcionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Luan";
        funcionario.salario = 3000;

        System.out.println("Funcionário: " + funcionario.nome);
        System.out.println("Salário: R$ " + funcionario.salario);
        System.out.println("Bônus: R$ " + funcionario.calcularBonus(10));

    }
}