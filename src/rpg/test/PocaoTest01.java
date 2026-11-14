package rpg.test;

import rpg.dominio.Pocao;

public class PocaoTest01 {

    public static void main(String[] args) {

        Pocao pocao1 = new Pocao();

        pocao1.nome = "Poção Pequena";
        pocao1.pontosCura = 20;
        pocao1.preco = 10;

        Pocao pocao2 = new Pocao();

        pocao2.nome = "Poção Grande";
        pocao2.pontosCura = 50;
        pocao2.preco = 25;

        System.out.println("=== POÇÃO 1 ===");
        System.out.println("Nome: " + pocao1.nome);
        System.out.println("Pontos de cura: " + pocao1.pontosCura);
        System.out.println("Preço: " + pocao1.preco);

        System.out.println("\n=== POÇÃO 2 ===");
        System.out.println("Nome: " + pocao2.nome);
        System.out.println("Pontos de cura: " + pocao2.pontosCura);
        System.out.println("Preço: " + pocao2.preco);
    }
}