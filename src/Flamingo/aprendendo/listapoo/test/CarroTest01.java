package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Honda";
        carro1.modelo = "Civic";
        carro1.ano = 2022;

        carro2.nome = "Volkswagen";
        carro2.modelo = "Polo";
        carro2.ano = 2024;

        System.out.println("Carro 1:");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println();

        System.out.println("Carro 2:");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);

    }
}