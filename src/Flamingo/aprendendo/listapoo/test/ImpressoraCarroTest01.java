package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Carro;
import Flamingo.aprendendo.listapoo.dominio.ImpressoraCarro;

public class ImpressoraCarroTest01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Honda";
        carro1.modelo = "Civic";
        carro1.ano = 2020;
        carro1.velocidadeAtual = 80;

        carro2.nome = "Volkswagen";
        carro2.modelo = "Gol";
        carro2.ano = 2015;
        carro2.velocidadeAtual = 60;

        ImpressoraCarro impressora = new ImpressoraCarro();

        impressora.imprime(carro1);
        impressora.imprime(carro2);

    }
}