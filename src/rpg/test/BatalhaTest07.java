package rpg.test;

import rpg.dominio.CadastroHeroi;
import rpg.dominio.CadastroMonstro;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;
import rpg.dominio.Batalha;

public class BatalhaTest07 {

    public static void main(String[] args) {

        CadastroHeroi cadastroHeroi = new CadastroHeroi();
        CadastroMonstro cadastroMonstro = new CadastroMonstro();

        Heroi heroi = cadastroHeroi.cadastrar("Arthur");
        Monstro monstro = cadastroMonstro.cadastrar("Goblin");

        heroi.experiencia = 90;
        monstro.vida = 10;

        Batalha batalha = new Batalha();

        batalha.heroiAtaca(heroi, monstro);
        batalha.entregarRecompensa(heroi, monstro);

        System.out.println("\n=== STATUS FINAL ===");
        System.out.println(heroi.gerarResumo());
    }
}