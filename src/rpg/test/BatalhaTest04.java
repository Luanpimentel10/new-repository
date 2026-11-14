package rpg.test;

import rpg.dominio.Batalha;
import rpg.dominio.CadastroHeroi;
import rpg.dominio.CadastroMonstro;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;

public class BatalhaTest04 {

    public static void main(String[] args) {

        CadastroHeroi cadastroHeroi = new CadastroHeroi();
        CadastroMonstro cadastroMonstro = new CadastroMonstro();

        Heroi heroi = cadastroHeroi.cadastrar("Arthur");
        Monstro monstro = cadastroMonstro.cadastrar("Goblin");

        Batalha batalha = new Batalha();

        monstro.vida = 10;

        System.out.println("Ouro inicial: " + heroi.ouro);
        System.out.println("Experiência inicial: " + heroi.experiencia);

        batalha.heroiAtaca(heroi, monstro);

        batalha.entregarRecompensa(heroi, monstro);

        System.out.println("Ouro final: " + heroi.ouro);
        System.out.println("Experiência final: " + heroi.experiencia);

        System.out.println("Tentando entregar novamente...");
        System.out.println("Recompensa entregue? " +
                batalha.entregarRecompensa(heroi, monstro));
    }
}