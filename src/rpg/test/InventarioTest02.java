package rpg.test;

import rpg.dominio.Arma;
import rpg.dominio.CadastroHeroi;
import rpg.dominio.Heroi;
import rpg.dominio.Pocao;

public class InventarioTest02 {

    public static void main(String[] args) {

        CadastroHeroi cadastro = new CadastroHeroi();
        Heroi heroi = cadastro.cadastrar("Arthur");

        Arma arma = new Arma();
        arma.nome = "Espada de Ferro";
        arma.bonusAtaque = 10;

        Pocao pocao1 = new Pocao();
        pocao1.nome = "Poção Pequena";
        pocao1.pontosCura = 20;

        Pocao pocao2 = new Pocao();
        pocao2.nome = "Poção Grande";
        pocao2.pontosCura = 50;

        heroi.inventario.armaEquipada = arma;
        heroi.inventario.pocoes[0] = pocao1;
        heroi.inventario.pocoes[1] = pocao2;
        heroi.inventario.quantidadePocoes = 2;

        System.out.println("=== INVENTÁRIO DE " + heroi.nome + " ===");

        System.out.println("Arma equipada: " +
                heroi.inventario.armaEquipada.nome);

        System.out.println("\nPoções:");

        for (int i = 0; i < heroi.inventario.quantidadePocoes; i++) {
            System.out.println((i + 1) + " - " +
                    heroi.inventario.pocoes[i].nome);
        }
    }
}