package rpg.test;

import rpg.dominio.Arma;
import rpg.dominio.CadastroHeroi;
import rpg.dominio.Heroi;
import rpg.dominio.Loja;
import rpg.dominio.Pocao;

import java.util.Scanner;

public class LojaTest03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CadastroHeroi cadastro = new CadastroHeroi();
        Heroi heroi = cadastro.cadastrar("Arthur");

        Loja loja = new Loja();

        Pocao pocao = new Pocao();
        pocao.nome = "Poção Pequena";
        pocao.pontosCura = 30;
        pocao.preco = 10;

        Arma arma = new Arma();
        arma.nome = "Espada de Ferro";
        arma.bonusAtaque = 10;
        arma.preco = 50;

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n=== LOJA RPG ===");
            System.out.println("Ouro disponível: " + heroi.ouro);
            System.out.println("1 - Comprar poção (10 ouro)");
            System.out.println("2 - Comprar espada (50 ouro)");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    if (loja.comprarPocao(heroi, pocao)) {
                        System.out.println("Poção comprada!");
                    } else {
                        System.out.println("Não foi possível comprar a poção.");
                    }
                    break;

                case 2:
                    if (loja.comprarArma(heroi, arma)) {
                        System.out.println("Espada comprada e equipada!");
                    } else {
                        System.out.println("Ouro insuficiente!");
                    }
                    break;

                case 3:
                    System.out.println("Saindo da loja...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        System.out.println("\n=== STATUS FINAL ===");
        System.out.println(heroi.gerarResumo());
        System.out.println("Poções: " +
                heroi.inventario.quantidadePocoes);

        scanner.close();
    }
}