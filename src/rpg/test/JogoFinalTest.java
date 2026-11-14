package rpg.test;

import rpg.dominio.CadastroHeroi;
import rpg.dominio.CadastroMonstro;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;
import rpg.dominio.Batalha;
import rpg.dominio.Fase;
import rpg.dominio.Pocao;

import java.util.Scanner;

public class JogoFinalTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CadastroHeroi cadastroHeroi = new CadastroHeroi();
        CadastroMonstro cadastroMonstro = new CadastroMonstro();

        System.out.println("================================");
        System.out.println("     A JORNADA DE ELDORIA");
        System.out.println("================================");

        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine();

        Heroi heroi = cadastroHeroi.cadastrar(nome);

        Pocao pocao1 = new Pocao();
        pocao1.nome = "Poção Pequena";
        pocao1.pontosCura = 30;

        Pocao pocao2 = new Pocao();
        pocao2.nome = "Poção Grande";
        pocao2.pontosCura = 50;

        heroi.inventario.pocoes[0] = pocao1;
        heroi.inventario.pocoes[1] = pocao2;
        heroi.inventario.quantidadePocoes = 2;

        Fase fase = new Fase();
        fase.nome = "Floresta Sombria";
        fase.numero = 1;

        Monstro goblin = cadastroMonstro.cadastrar("Goblin");

        Monstro esqueleto = cadastroMonstro.cadastrar("Esqueleto");
        esqueleto.vida = 40;
        esqueleto.ataque = 8;
        esqueleto.defesa = 2;
        esqueleto.ouroRecompensa = 20;
        esqueleto.experienciaRecompensa = 40;

        fase.monstros = new Monstro[]{goblin, esqueleto};

        System.out.println("\nBem-vindo, " + heroi.nome + "!");
        System.out.println("Fase: " + fase.numero);
        System.out.println("Local: " + fase.nome);

        boolean fugiu = false;

        for (Monstro monstro : fase.monstros) {

            System.out.println("\nUm " + monstro.nome + " apareceu!");

            Batalha batalha = new Batalha();

            while (heroi.estaVivo() && monstro.estaVivo()) {

                System.out.println("\n=== MENU DE BATALHA ===");
                System.out.println("1 - Atacar");
                System.out.println("2 - Usar poção");
                System.out.println("3 - Fugir");
                System.out.print("Escolha: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Digite apenas números!");
                    scanner.next();
                    continue;
                }

                int opcao = scanner.nextInt();

                switch (opcao) {

                    case 1:
                        batalha.executarTurno(heroi, monstro);
                        break;

                    case 2:

                        if (heroi.inventario.quantidadePocoes > 0) {

                            System.out.println("\n=== POÇÕES ===");

                            for (int i = 0;
                                 i < heroi.inventario.quantidadePocoes;
                                 i++) {

                                System.out.println((i + 1) + " - " +
                                        heroi.inventario.pocoes[i].nome);
                            }

                            System.out.print("Escolha: ");

                            if (!scanner.hasNextInt()) {
                                System.out.println("Digite apenas números!");
                                scanner.next();
                                break;
                            }

                            int indice = scanner.nextInt() - 1;

                            if (heroi.usarPocao(indice)) {
                                System.out.println("Poção utilizada!");
                                System.out.println("Vida atual: " + heroi.vida);
                            } else {
                                System.out.println("Opção inválida!");
                            }

                        } else {
                            System.out.println("Você não possui poções!");
                        }

                        break;

                    case 3:
                        System.out.println("Você fugiu da aventura!");
                        fugiu = true;
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

                if (fugiu) {
                    break;
                }
            }

            if (fugiu || !heroi.estaVivo()) {
                break;
            }

            batalha.entregarRecompensa(heroi, monstro);
        }

        System.out.println("\n================================");
        System.out.println("        FIM DA AVENTURA");
        System.out.println("================================");

        if (!heroi.estaVivo()) {
            System.out.println("Você foi derrotado!");
        } else if (fugiu) {
            System.out.println("Você abandonou sua jornada.");
        } else {
            System.out.println("PARABÉNS! VOCÊ CONCLUIU A FASE!");
        }

        System.out.println("\n=== STATUS FINAL ===");
        System.out.println(heroi.gerarResumo());

        scanner.close();
    }
}