package rpg.test;

import rpg.dominio.CadastroHeroi;
import rpg.dominio.Heroi;
import rpg.dominio.Pocao;
import rpg.dominio.Arma;

import java.util.Scanner;

public class InventarioTest03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CadastroHeroi cadastro = new CadastroHeroi();
        Heroi heroi = cadastro.cadastrar("Arthur");

        heroi.vida = 50;

        Arma arma = new Arma();
        arma.nome = "Espada de Ferro";
        arma.bonusAtaque = 10;

        heroi.inventario.armaEquipada = arma;

        Pocao pocao1 = new Pocao();
        pocao1.nome = "Poção Pequena";
        pocao1.pontosCura = 20;

        Pocao pocao2 = new Pocao();
        pocao2.nome = "Poção Grande";
        pocao2.pontosCura = 40;

        heroi.inventario.pocoes[0] = pocao1;
        heroi.inventario.pocoes[1] = pocao2;
        heroi.inventario.quantidadePocoes = 2;

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n=== INVENTÁRIO ===");
            System.out.println("Vida: " + heroi.vida);
            System.out.println("Arma equipada: " +
                    heroi.inventario.armaEquipada.nome);
            System.out.println("Poções disponíveis: " +
                    heroi.inventario.quantidadePocoes);

            System.out.println("\n1 - Ver poções");
            System.out.println("2 - Usar poção");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    for (int i = 0; i < heroi.inventario.quantidadePocoes; i++) {
                        System.out.println((i + 1) + " - " +
                                heroi.inventario.pocoes[i].nome);
                    }
                    break;

                case 2:
                    if (heroi.inventario.quantidadePocoes > 0) {

                        System.out.println("Escolha a poção:");
                        for (int i = 0; i < heroi.inventario.quantidadePocoes; i++) {
                            System.out.println((i + 1) + " - " +
                                    heroi.inventario.pocoes[i].nome);
                        }

                        int indice = scanner.nextInt() - 1;

                        if (heroi.usarPocao(indice)) {
                            System.out.println("Poção utilizada!");
                        } else {
                            System.out.println("Opção inválida!");
                        }

                    } else {
                        System.out.println("Você não possui poções!");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do inventário...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}