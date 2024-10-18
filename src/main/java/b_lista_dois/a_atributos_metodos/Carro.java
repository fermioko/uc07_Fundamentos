package b_lista_dois.a_atributos_metodos;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(){
        System.out.println("Acelerando o carro.");
    }

    public void frear(){
        System.out.println("Freando o carro.");
    }

    public void exibirDadosCarro(){
        System.out.println("\n\nCarro Informações");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

}

