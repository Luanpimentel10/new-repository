package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Estudante;
import Flamingo.aprendendo.listapoo.dominio.ImpressoraEstudante;

public class ImpressoraEstudanteTest01 {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Luan";
        estudante1.idade = 25;
        estudante1.sexo = 'M';

        estudante2.nome = "Carlos";
        estudante2.idade = 22;
        estudante2.sexo = 'M';

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

    }
}