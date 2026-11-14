package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest06 {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.nome = "Honda";
        carro.velocidadeAtual = 40;

        System.out.println("Velocidade inicial: " + carro.velocidadeAtual);

        carro.acelerar(30);

        System.out.println("Velocidade após acelerar: " + carro.velocidadeAtual);

    }
}