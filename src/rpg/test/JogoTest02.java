package rpg.test;

import rpg.dominio.Heroi;
import rpg.dominio.Jogo;

public class JogoTest02 {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.nome = "Arthur";
        heroi.vida = 100;
        heroi.vidaMaxima = 100;
        heroi.ataque = 15;
        heroi.defesa = 5;
        heroi.nivel = 1;
        heroi.experiencia = 0;
        heroi.ouro = 30;

        Jogo jogo = new Jogo();
        jogo.titulo = "RPG: A Jornada de Eldoria";
        jogo.heroi = heroi;
        jogo.emExecucao = true;

        System.out.println("=== JOGO ===");
        System.out.println("Título: " + jogo.titulo);
        System.out.println("Herói: " + jogo.heroi.nome);
        System.out.println("Vida: " + jogo.heroi.vida);
        System.out.println("Nível: " + jogo.heroi.nivel);
        System.out.println("Em execução: " + jogo.emExecucao);
    }
}