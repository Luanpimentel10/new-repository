package rpg.test;

import rpg.dominio.CadastroMonstro;
import rpg.dominio.Monstro;

public class ValidacaoTest02 {

    public static void main(String[] args) {

        CadastroMonstro cadastro = new CadastroMonstro();

        Monstro monstro = cadastro.cadastrar("Goblin");

        System.out.println("=== VALIDAÇÃO DO MONSTRO ===");

        if (monstro.nome != null && !monstro.nome.isBlank()) {
            System.out.println("Nome: válido");
        } else {
            System.out.println("Nome: inválido");
        }

        if (monstro.vida > 0) {
            System.out.println("Vida: válida");
        } else {
            System.out.println("Vida: inválida");
        }

        if (monstro.ataque >= 0) {
            System.out.println("Ataque: válido");
        } else {
            System.out.println("Ataque: inválido");
        }

        if (monstro.defesa >= 0) {
            System.out.println("Defesa: válida");
        } else {
            System.out.println("Defesa: inválida");
        }

        if (monstro.ouroRecompensa >= 0) {
            System.out.println("Recompensa: válida");
        } else {
            System.out.println("Recompensa: inválida");
        }
    }
}
