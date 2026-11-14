package rpg.dominio;

public class ImpressoraRPG {

    public void imprimirHeroi(Heroi heroi) {
        System.out.println(heroi.gerarResumo());
    }

    public void imprimirMonstro(Monstro monstro) {
        System.out.println(monstro.gerarResumo());
    }
}