package rpg.test;

import rpg.dominio.CadastroHeroi;
import rpg.dominio.Heroi;
import rpg.dominio.ImpressoraRPG;

import java.util.Scanner;

public class JogoTest04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CadastroHeroi cadastro = new CadastroHeroi();
        ImpressoraRPG impressora = new ImpressoraRPG();

        Heroi heroi = cadastro.cadastrar("Arthur");

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n=== JORNADA DE ELDORIA ===");
            System.out.println("1 - Ver personagem");
            System.out.println("2 - Ver ouro e experiência");
            System.out.println("3 - Recuperar vida");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    impressora.imprimirHeroi(heroi);
                    break;

                case 2:
                    System.out.println("Ouro: " + heroi.ouro);
                    System.out.println("Experiência: " + heroi.experiencia);
                    System.out.println("Nível: " + heroi.nivel);
                    break;

                case 3:
                    heroi.curar(30);
                    System.out.println("Vida atual: " + heroi.vida);
                    break;

                case 4:
                    System.out.println("Encerrando o jogo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}