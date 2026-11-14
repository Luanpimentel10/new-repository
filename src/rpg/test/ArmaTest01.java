package rpg.test;

import rpg.dominio.Arma;

public class ArmaTest01 {

    public static void main(String[] args) {

        Arma arma1 = new Arma();

        arma1.nome = "Espada de Madeira";
        arma1.bonusAtaque = 2;
        arma1.preco = 15;

        Arma arma2 = new Arma();

        arma2.nome = "Espada de Ferro";
        arma2.bonusAtaque = 8;
        arma2.preco = 50;

        System.out.println("=== ARMA 1 ===");
        System.out.println("Nome: " + arma1.nome);
        System.out.println("Bônus de ataque: " + arma1.bonusAtaque);
        System.out.println("Preço: " + arma1.preco);

        System.out.println("\n=== ARMA 2 ===");
        System.out.println("Nome: " + arma2.nome);
        System.out.println("Bônus de ataque: " + arma2.bonusAtaque);
        System.out.println("Preço: " + arma2.preco);
    }
}