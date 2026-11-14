package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest05 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "Luan";
        aluno1.nota1 = 8;
        aluno1.nota2 = 9;

        aluno2.nome = "Carlos";
        aluno2.nota1 = 6;
        aluno2.nota2 = 5;

        aluno3.nome = "Pedro";
        aluno3.nota1 = 3;
        aluno3.nota2 = 4;

        aluno1.imprimirSituacao();
        aluno2.imprimirSituacao();
        aluno3.imprimirSituacao();

    }
}