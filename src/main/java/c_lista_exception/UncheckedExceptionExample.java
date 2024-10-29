package c_lista_exception;

public class UncheckedExceptionExample {
    public static void main(String[] args) {

        String str = null;

        //Tentando acessar o comprimento da string
        System.out.println(str.length());
        //Isso causará uma NullPointerException

    }

}
