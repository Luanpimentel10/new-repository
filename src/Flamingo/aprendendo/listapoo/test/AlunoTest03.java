package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest03 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Luan";
        aluno.nota1 = 8.5;
        aluno.nota2 = 7.5;

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Aprovado: " + aluno.isAprovado());

    }
}