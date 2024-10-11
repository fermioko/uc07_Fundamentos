package d_operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        Scanner scannerop = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scannerop.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scannerop.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = (double) num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (num2 != 0) {
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão: Não é possível dividir por zero.");
        }

    }
}
