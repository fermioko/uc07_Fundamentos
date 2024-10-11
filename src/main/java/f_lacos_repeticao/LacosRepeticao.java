package f_lacos_repeticao;

import java.util.Scanner;

public class LacosRepeticao {

    public static void main(String[] args) {

        Scanner scannernum = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int tabuada= scannernum.nextInt();

        for (int i = 0; i < 11; i++) {
            int resultado = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resultado);
        }

    }

}
