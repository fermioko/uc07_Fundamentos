package c_lista_exception;

import java.util.Scanner;

public class TestarNossaException {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scr.nextInt();

        if (idade < 18){
            throw new RuntimeException("Idade inválida");
        }


    }
}
