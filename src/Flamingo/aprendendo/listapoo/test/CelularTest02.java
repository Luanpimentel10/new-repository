package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Celular;

public class CelularTest02 {

    public static void main(String[] args) {

        Celular celular1 = new Celular();
        Celular celular2 = new Celular();

        celular1.marca = "Samsung";
        celular1.modelo = "S25";
        celular1.preco = 4500;

        celular2.marca = "Motorola";
        celular2.modelo = "G85";
        celular2.preco = 1800;

        System.out.println(celular1.marca + " " + celular1.modelo + ": " + celular1.isPremium());
        System.out.println(celular2.marca + " " + celular2.modelo + ": " + celular2.isPremium());

    }
}