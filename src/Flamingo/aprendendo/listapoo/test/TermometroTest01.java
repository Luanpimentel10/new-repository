package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Termometro;

public class TermometroTest01 {

    public static void main(String[] args) {

        Termometro termometro1 = new Termometro();
        Termometro termometro2 = new Termometro();

        termometro1.temperaturaAtual = 40;
        termometro2.temperaturaAtual = 25;

        System.out.println("Temperatura 1: " + termometro1.passouDoLimite(35));
        System.out.println("Temperatura 2: " + termometro2.passouDoLimite(35));

    }
}