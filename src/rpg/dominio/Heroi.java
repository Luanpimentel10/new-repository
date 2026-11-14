package rpg.dominio;

public class Heroi {

    public String nome;
    public int vida;
    public int vidaMaxima;
    public int ataque;
    public int defesa;
    public int nivel;
    public int experiencia;
    public int ouro;
    public Inventario inventario;

    public boolean estaVivo() {
        return vida > 0;
    }

    public int calcularAtaqueTotal() {
        if (inventario != null && inventario.armaEquipada != null) {
            return ataque + inventario.armaEquipada.bonusAtaque;
        }
        return ataque;
    }

    public int calcularDano(int defesaInimigo) {
        return Math.max(1, calcularAtaqueTotal() - defesaInimigo);
    }

    public void receberDano(int dano) {
        if (dano < 0) {
            dano = 0;
        }
        vida -= dano;
        vida = Math.max(0, vida);
    }

    public void curar(int quantidade) {
        if (quantidade > 0) {
            vida += quantidade;
        }
        vida = Math.min(vida, vidaMaxima);
    }

    public String gerarResumo() {
        return "=== HERÓI ===\n" +
                "Nome: " + nome + "\n" +
                "Vida: " + vida + "/" + vidaMaxima + "\n" +
                "Ataque: " + calcularAtaqueTotal() + "\n" +
                "Defesa: " + defesa + "\n" +
                "Nível: " + nivel + "\n" +
                "Experiência: " + experiencia + "\n" +
                "Ouro: " + ouro;
    }

    public boolean usarPocao(int indice) {

        if (inventario == null ||
                inventario.pocoes == null ||
                indice < 0 ||
                indice >= inventario.quantidadePocoes) {
            return false;
        }

        Pocao pocao = inventario.pocoes[indice];

        if (pocao == null) {
            return false;
        }

        curar(pocao.pontosCura);

        for (int i = indice; i < inventario.quantidadePocoes - 1; i++) {
            inventario.pocoes[i] = inventario.pocoes[i + 1];
        }

        inventario.quantidadePocoes--;
        inventario.pocoes[inventario.quantidadePocoes] = null;

        return true;
    }

    public void ganharExperiencia(int quantidade) {

        experiencia += quantidade;

        while (experiencia >= 100) {

            experiencia -= 100;
            nivel++;

            vidaMaxima += 20;
            vida = vidaMaxima;

            ataque += 5;
            defesa += 2;

            System.out.println("SUBIU DE NÍVEL!");
            System.out.println("Novo nível: " + nivel);
        }
    }
}