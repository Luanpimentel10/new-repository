package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Estudante;
import Flamingo.aprendendo.listapoo.dominio.CadastroEstudante;

public class CadastroEstudanteTest01 {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        CadastroEstudante cadastro = new CadastroEstudante();

        cadastro.cadastrar(estudante1, "Luan", 25, 'M');
        cadastro.cadastrar(estudante2, "Carlos", 22, 'M');

        System.out.println("Nome: " + estudante1.nome);
        System.out.println("Idade: " + estudante1.idade);
        System.out.println("Sexo: " + estudante1.sexo);

        System.out.println("-------------------");

        System.out.println("Nome: " + estudante2.nome);
        System.out.println("Idade: " + estudante2.idade);
        System.out.println("Sexo: " + estudante2.sexo);

    }
}