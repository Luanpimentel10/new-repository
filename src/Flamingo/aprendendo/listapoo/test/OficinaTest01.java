package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Carro;
import Flamingo.aprendendo.listapoo.dominio.Oficina;

public class OficinaTest01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.nome = "Honda";
        carro1.velocidadeAtual = 80;

        Carro carro2 = new Carro();
        carro2.nome = "Volkswagen";
        carro2.velocidadeAtual = 60;

        Oficina oficina = new Oficina();

        System.out.println("Antes da troca:");
        System.out.println(carro1.nome + ": " + carro1.velocidadeAtual);
        System.out.println(carro2.nome + ": " + carro2.velocidadeAtual);

        oficina.trocarVelocidades(carro1, carro2);

        System.out.println("-------------------");
        System.out.println("Depois da troca:");
        System.out.println(carro1.nome + ": " + carro1.velocidadeAtual);
        System.out.println(carro2.nome + ": " + carro2.velocidadeAtual);

    }
}