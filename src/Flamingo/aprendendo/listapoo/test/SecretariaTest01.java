package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Aluno;
import Flamingo.aprendendo.listapoo.dominio.Secretaria;

public class SecretariaTest01 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "Luan";
        aluno.nota1 = 5;
        aluno.nota2 = 6;

        Secretaria secretaria = new Secretaria();

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Notas antigas: " + aluno.nota1 + " e " + aluno.nota2);

        secretaria.atualizarAluno(aluno, 9, 8);

        System.out.println("Notas atualizadas: " + aluno.nota1 + " e " + aluno.nota2);
        System.out.println("Situação: " + aluno.getSituacao());

    }
}