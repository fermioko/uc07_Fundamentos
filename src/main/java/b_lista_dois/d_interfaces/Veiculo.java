package b_lista_dois.d_interfaces;

public class Veiculo {
    public static void main(String[] args) {

        Carro carro = new Carro();

        Bicicleta bicicleta = new Bicicleta();

        carro.acelera();
        carro.frear();

        bicicleta.acelera();
        bicicleta.frear();

    }
}

