package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Luan";
        pessoa1.idade = 25;

        pessoa2.nome = "Carlos";
        pessoa2.idade = 16;

        System.out.println(pessoa1.nome + ": " + pessoa1.isMaiorDeIdade(18));
        System.out.println(pessoa2.nome + ": " + pessoa2.isMaiorDeIdade(18));

    }
}