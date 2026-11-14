package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest07 {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.nome = "Honda";
        carro.velocidadeAtual = 80;

        System.out.println("Velocidade inicial: " + carro.velocidadeAtual);

        carro.frear(30);

        System.out.println("Velocidade após frear: " + carro.velocidadeAtual);

        carro.frear(100);

        System.out.println("Velocidade após frear novamente: " + carro.velocidadeAtual);

    }
}