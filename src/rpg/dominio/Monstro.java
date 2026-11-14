package rpg.dominio;

public class Monstro {

    public String nome;
    public int vida;
    public int ataque;
    public int defesa;
    public int ouroRecompensa;
    public int experienciaRecompensa;

    public boolean estaVivo() {
        return vida > 0;
    }

    public int calcularDano(int defesaHeroi) {
        int dano = ataque - defesaHeroi;
        return Math.max(1, dano);
    }

    public void receberDano(int dano) {
        if (dano < 0) {
            dano = 0;
        }

        vida -= dano;
        vida = Math.max(0, vida);
    }

    public String gerarResumo() {
        return "=== MONSTRO ===\n" +
                "Nome: " + nome + "\n" +
                "Vida: " + vida + "\n" +
                "Ataque: " + ataque + "\n" +
                "Defesa: " + defesa + "\n" +
                "Ouro recompensa: " + ouroRecompensa + "\n" +
                "Experiência recompensa: " + experienciaRecompensa;
    }
}