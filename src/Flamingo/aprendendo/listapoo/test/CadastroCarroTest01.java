package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Carro;
import Flamingo.aprendendo.listapoo.dominio.CadastroCarro;

public class CadastroCarroTest01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        CadastroCarro cadastro = new CadastroCarro();

        cadastro.cadastrar(carro1, "Honda", "Civic", 2020, 80);
        cadastro.cadastrar(carro2, "Volkswagen", "Gol", 2015, 60);

        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Velocidade: " + carro1.velocidadeAtual);

        System.out.println("-------------------");

        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Velocidade: " + carro2.velocidadeAtual);

    }
}