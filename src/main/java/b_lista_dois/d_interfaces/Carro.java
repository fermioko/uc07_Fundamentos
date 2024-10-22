package b_lista_dois.d_interfaces;

public class Carro implements VeiculoInterface{


    @Override
    public void acelera() {
        System.out.println("Carro Acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("Carro Freando!");
    }
}
