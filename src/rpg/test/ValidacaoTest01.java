package rpg.test;

import rpg.dominio.CadastroHeroi;
import rpg.dominio.Heroi;

public class ValidacaoTest01 {

    public static void main(String[] args) {

        CadastroHeroi cadastro = new CadastroHeroi();

        Heroi heroi = cadastro.cadastrar("Arthur");

        System.out.println("=== VALIDAÇÃO DO HERÓI ===");

        if (heroi.nome != null && !heroi.nome.isBlank()) {
            System.out.println("Nome: válido");
        } else {
            System.out.println("Nome: inválido");
        }

        if (heroi.vida > 0) {
            System.out.println("Vida: válida");
        } else {
            System.out.println("Vida: inválida");
        }

        if (heroi.nivel > 0) {
            System.out.println("Nível: válido");
        } else {
            System.out.println("Nível: inválido");
        }

        if (heroi.ouro >= 0) {
            System.out.println("Ouro: válido");
        } else {
            System.out.println("Ouro: inválido");
        }

        if (heroi.inventario != null) {
            System.out.println("Inventário: válido");
        } else {
            System.out.println("Inventário: inválido");
        }
    }
}