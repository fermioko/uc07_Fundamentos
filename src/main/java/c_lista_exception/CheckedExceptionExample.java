package c_lista_exception;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {

        String filePath = "caminho-do-arquivo.txt";

        try{
            //Abrindo um arquivo para leitura
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String linha;

            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

            reader.close();
        } catch (IOException e){
            System.out.println("Erro ao tentar ler arquivo: " + e.getMessage());
        }

    }
}
