package b_lista_dois.f_coesao_acoplamento;

public class Calculadora {

    public double somar(double n1, double n2){
        return n1 + n2;
    }

    public double subtrair(double n1, double n2){
        return n1 - n2;
    }

    public double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    public double dividir(double n1, double n2){
        if (n2 == 0){
            throw new RuntimeException("Divisor nao pode ser Zero");
        }
        return n1 / n2;
    }

}
