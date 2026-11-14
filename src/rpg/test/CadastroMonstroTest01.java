package rpg.test;

import rpg.dominio.CadastroMonstro;
import rpg.dominio.Monstro;

public class CadastroMonstroTest01 {

    public static void main(String[] args) {

        CadastroMonstro cadastro = new CadastroMonstro();

        Monstro monstro = cadastro.cadastrar("Goblin");

        System.out.println(monstro.gerarResumo());
    }
}