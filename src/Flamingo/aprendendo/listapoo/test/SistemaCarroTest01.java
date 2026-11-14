package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Carro;
import Flamingo.aprendendo.listapoo.dominio.CadastroCarro;
import Flamingo.aprendendo.listapoo.dominio.ImpressoraCarro;

public class SistemaCarroTest01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        CadastroCarro cadastro = new CadastroCarro();

        cadastro.cadastrar(carro1, "Honda", "Civic", 2020, 100);
        cadastro.cadastrar(carro2, "Volkswagen", "Gol", 2015, 60);

        ImpressoraCarro impressora = new ImpressoraCarro();

        System.out.println("SISTEMA DE CADASTRO DE CARROS");
        System.out.println("=============================");

        impressora.imprimir(carro1, 80);
        impressora.imprimir(carro2, 80);

    }
}