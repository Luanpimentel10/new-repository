package Flamingo.aprendendo.listapoo.dominio;

public class ImpressoraCarro {

    public void imprime(Carro carro) {

        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade atual: " + carro.velocidadeAtual);
        System.out.println("-------------------");

    }

    public void imprimir(Carro carro, int limiteDaVia) {

        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade atual: " + carro.velocidadeAtual);
        System.out.println("Situação: " + carro.gerarMensagemMulta(limiteDaVia));
        System.out.println("-------------------");

    }

}