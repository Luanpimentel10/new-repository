package rpg.test;

import rpg.dominio.CadastroHeroi;
import rpg.dominio.Heroi;

public class HeroiTest09 {

    public static void main(String[] args) {

        CadastroHeroi cadastro = new CadastroHeroi();
        Heroi heroi = cadastro.cadastrar("Arthur");

        System.out.println("Nível inicial: " + heroi.nivel);
        System.out.println("Experiência inicial: " + heroi.experiencia);

        heroi.ganharExperiencia(120);

        System.out.println("\n=== STATUS APÓS EXPERIÊNCIA ===");
        System.out.println(heroi.gerarResumo());
    }
}