package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest01 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Luan";
        aluno.nota1 = 8.5;
        aluno.nota2 = 7.5;

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);

    }
}