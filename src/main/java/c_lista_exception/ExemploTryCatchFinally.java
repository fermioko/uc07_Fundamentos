package c_lista_exception;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {

        try{
            int resultado = 10 / 0;
        } catch(ClassCastException e){  //ArithmeticException
            System.out.println("Erro: Não é possível dividir por zero.");
        } finally {
            System.out.println("Bloco finally executado. Limpeza de variáveis");
        }
        System.out.println("Continuação do programa após o bloco try-catch-finally");

    }

}
