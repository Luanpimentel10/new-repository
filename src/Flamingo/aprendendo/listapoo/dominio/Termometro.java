package Flamingo.aprendendo.listapoo.dominio;

public class Termometro {

    public double temperaturaAtual;

    public boolean passouDoLimite(double temperaturaLimite) {
        return temperaturaAtual > temperaturaLimite;
    }

}