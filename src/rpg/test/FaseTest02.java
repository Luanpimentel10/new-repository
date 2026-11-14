package rpg.test;

import rpg.dominio.CadastroMonstro;
import rpg.dominio.Monstro;

public class FaseTest02 {

    public static void main(String[] args) {

        CadastroMonstro cadastro = new CadastroMonstro();

        Monstro[] monstros = new Monstro[3];

        monstros[0] = cadastro.cadastrar("Goblin");
        monstros[1] = cadastro.cadastrar("Esqueleto");
        monstros[2] = cadastro.cadastrar("Orc");

        System.out.println("=== MONSTROS DA FASE ===");

        for (int i = 0; i < monstros.length; i++) {
            System.out.println("\nMonstro " + (i + 1));
            System.out.println(monstros[i].gerarResumo());
        }
    }
}