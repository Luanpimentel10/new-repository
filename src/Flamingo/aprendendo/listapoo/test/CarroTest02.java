package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest02 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Honda";
        carro1.modelo = "Civic";
        carro1.ano = 2008;

        carro2.nome = "Volkswagen";
        carro2.modelo = "Polo";
        carro2.ano = 2024;

        System.out.println(carro1.nome + ": " + carro1.verificarIdadeDoCarro());
        System.out.println(carro2.nome + ": " + carro2.verificarIdadeDoCarro());

    }
}