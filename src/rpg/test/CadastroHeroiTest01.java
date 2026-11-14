package rpg.test;

import rpg.dominio.CadastroHeroi;
import rpg.dominio.Heroi;

public class CadastroHeroiTest01 {

    public static void main(String[] args) {

        CadastroHeroi cadastro = new CadastroHeroi();

        Heroi heroi = cadastro.cadastrar("Arthur");

        System.out.println(heroi.gerarResumo());
        System.out.println("Inventário criado? " + (heroi.inventario != null));
    }
}