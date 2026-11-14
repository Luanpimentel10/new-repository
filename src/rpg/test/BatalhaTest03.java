package rpg.test;

import rpg.dominio.Batalha;
import rpg.dominio.CadastroHeroi;
import rpg.dominio.CadastroMonstro;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;

public class BatalhaTest03 {

    public static void main(String[] args) {

        CadastroHeroi cadastroHeroi = new CadastroHeroi();
        CadastroMonstro cadastroMonstro = new CadastroMonstro();

        Heroi heroi = cadastroHeroi.cadastrar("Arthur");
        Monstro monstro = cadastroMonstro.cadastrar("Goblin");

        Batalha batalha = new Batalha();

        batalha.executarTurno(heroi, monstro);
    }
}