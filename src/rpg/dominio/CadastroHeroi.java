package rpg.dominio;

public class CadastroHeroi {

    public Heroi cadastrar(String nome) {

        Heroi heroi = new Heroi();

        heroi.nome = nome;
        heroi.vida = 100;
        heroi.vidaMaxima = 100;
        heroi.ataque = 15;
        heroi.defesa = 5;
        heroi.nivel = 1;
        heroi.experiencia = 0;
        heroi.ouro = 30;
        heroi.inventario = new Inventario();
        heroi.inventario.pocoes = new Pocao[10];
        heroi.inventario.quantidadePocoes = 0;

        return heroi;
    }
}