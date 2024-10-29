package c_lista_exception;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3};

        //Acessando o índice 3, inválido
        int number = numbers[1];

        System.out.println("Número: " + number);

    }
}
