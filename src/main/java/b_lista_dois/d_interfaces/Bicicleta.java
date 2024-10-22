package b_lista_dois.d_interfaces;

public class Bicicleta implements VeiculoInterface{

    @Override
    public void acelera() {
        System.out.println("Bicicleta Acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta Freando!");
    }
}
