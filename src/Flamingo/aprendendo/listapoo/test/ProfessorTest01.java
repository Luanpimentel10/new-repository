package Flamingo.aprendendo.listapoo.test;

import Flamingo.aprendendo.listapoo.dominio.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Carlos";
        professor.idade = 40;
        professor.disciplina = "Java";
        professor.salario = 4500.00;

        System.out.println("Nome: " + professor.nome);
        System.out.println("Idade: " + professor.idade);
        System.out.println("Disciplina: " + professor.disciplina);
        System.out.println("Salário: " + professor.salario);

    }
}