package rpg.dominio;

public class Batalha {

    public boolean recompensaEntregue = false;

    public void heroiAtaca(Heroi heroi, Monstro monstro) {
        if (heroi.estaVivo() && monstro.estaVivo()) {
            int dano = heroi.calcularDano(monstro.defesa);
            monstro.receberDano(dano);

            System.out.println(heroi.nome + " causou " + dano + " de dano!");
        }
    }

    public void monstroAtaca(Monstro monstro, Heroi heroi) {
        if (monstro.estaVivo() && heroi.estaVivo()) {
            int dano = monstro.calcularDano(heroi.defesa);
            heroi.receberDano(dano);

            System.out.println(monstro.nome + " causou " + dano + " de dano!");
        }
    }

    public void executarTurno(Heroi heroi, Monstro monstro) {
        heroiAtaca(heroi, monstro);

        if (monstro.estaVivo()) {
            monstroAtaca(monstro, heroi);
        }

        System.out.println("Vida do herói: " + heroi.vida);
        System.out.println("Vida do monstro: " + monstro.vida);
    }

    public boolean entregarRecompensa(Heroi heroi, Monstro monstro) {

        if (heroi == null || monstro == null) {
            return false;
        }

        if (monstro.estaVivo() || recompensaEntregue) {
            return false;
        }

        heroi.ouro += monstro.ouroRecompensa;
        heroi.ganharExperiencia(monstro.experienciaRecompensa);

        recompensaEntregue = true;

        System.out.println("Vitória!");
        System.out.println("Ouro recebido: " + monstro.ouroRecompensa);
        System.out.println("Experiência recebida: " +
                monstro.experienciaRecompensa);

        return true;
    }
}