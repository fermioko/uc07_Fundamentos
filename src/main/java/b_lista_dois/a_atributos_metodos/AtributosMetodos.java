package b_lista_dois.a_atributos_metodos;

import java.util.Scanner;

public class AtributosMetodos {
    public static void main(String[] args) {

        Scanner scannerCarro = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = scannerCarro.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = scannerCarro.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = scannerCarro.nextInt();

        //cria o objeto carro com dados fornecidos
        Carro carro = new Carro(marca, modelo,ano);

        carro.exibirDadosCarro();

        carro.acelerar();

        carro.frear();

    }

}


//(Atributos e Métodos de uma Classe) -
// Crie uma classe Carro com os atributos
// marca, modelo e ano.
// Adicione métodos para acelerar,
// frear e
// exibir os dados do carro.