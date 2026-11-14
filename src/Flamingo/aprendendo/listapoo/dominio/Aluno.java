package Flamingo.aprendendo.listapoo.dominio;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean isAprovado() {
        return calcularMedia() >= 7;
    }

    public String getSituacao() {
        if (calcularMedia() >= 7) {
            return "Aprovado";
        } else if (calcularMedia() >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void imprimirSituacao() {
        System.out.println(nome + ": " + getSituacao());
    }

    public void atualizarNotas(double novaNota1, double novaNota2) {
        nota1 = novaNota1;
        nota2 = novaNota2;
    }

}