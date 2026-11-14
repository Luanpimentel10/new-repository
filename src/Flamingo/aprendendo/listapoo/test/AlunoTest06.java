package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest06 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Luan";
        aluno.nota1 = 5;
        aluno.nota2 = 6;

        System.out.println("Notas antigas: " + aluno.nota1 + " e " + aluno.nota2);

        aluno.atualizarNotas(9, 8);

        System.out.println("Notas atualizadas: " + aluno.nota1 + " e " + aluno.nota2);
        aluno.imprimirSituacao();

    }
}