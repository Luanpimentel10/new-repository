package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Aluno;
import Flamingo.aprendendo.listapoo.dominio.ComparadorAluno;

public class ComparadorAlunoTest01 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Luan";
        aluno1.nota1 = 8;
        aluno1.nota2 = 9;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Carlos";
        aluno2.nota1 = 6;
        aluno2.nota2 = 7;

        ComparadorAluno comparador = new ComparadorAluno();

        Aluno melhorAluno = comparador.retornarAlunoComMaiorMedia(aluno1, aluno2);

        System.out.println("Aluno com maior média: " + melhorAluno.nome);
        System.out.println("Média: " + melhorAluno.calcularMedia());

    }
}