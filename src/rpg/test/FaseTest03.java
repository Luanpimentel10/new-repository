package rpg.test;

import rpg.dominio.CadastroMonstro;
import rpg.dominio.Fase;
import rpg.dominio.Monstro;

public class FaseTest03 {

    public static void main(String[] args) {

        CadastroMonstro cadastro = new CadastroMonstro();

        Fase fase1 = new Fase();
        fase1.nome = "Floresta Sombria";
        fase1.monstros = new Monstro[2];

        fase1.monstros[0] = cadastro.cadastrar("Goblin");
        fase1.monstros[1] = cadastro.cadastrar("Esqueleto");

        System.out.println("=== " + fase1.nome + " ===");

        for (int i = 0; i < fase1.monstros.length; i++) {
            System.out.println("\nInimigo " + (i + 1));
            System.out.println(fase1.monstros[i].gerarResumo());
        }

        System.out.println("\nTodos os inimigos foram cadastrados!");
        System.out.println("Próxima fase desbloqueada!");
    }
}