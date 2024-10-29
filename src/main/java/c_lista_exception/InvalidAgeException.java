package c_lista_exception;

public class InvalidAgeException extends Exception{

    //Construtor que aceita uma mensagem de erro

    public InvalidAgeException(String message){
        super(message);  //Passa a mensagem para a classe Exception
    }

}
