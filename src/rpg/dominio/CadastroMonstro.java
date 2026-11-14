package rpg.dominio;

public class CadastroMonstro {

    public Monstro cadastrar(String nome) {

        Monstro monstro = new Monstro();

        monstro.nome = nome;
        monstro.vida = 30;
        monstro.ataque = 6;
        monstro.defesa = 1;
        monstro.ouroRecompensa = 10;
        monstro.experienciaRecompensa = 20;

        return monstro;
    }
}