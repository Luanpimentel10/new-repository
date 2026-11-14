package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest03 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Honda";
        carro1.velocidadeAtual = 100;

        carro2.nome = "Volkswagen";
        carro2.velocidadeAtual = 80;

        System.out.println(carro1.nome + ": " + carro1.isMultado(90));
        System.out.println(carro2.nome + ": " + carro2.isMultado(90));

    }
}