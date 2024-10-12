package a_lista_um.e_estrutura_decisao;

import java.util.Scanner;

public class EstruturaDecisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int idade = scanner.nextInt();

        while (idade < 0 || idade > 120){
            System.out.println("Idade inválida, digite novamente entre 0 a 120: ");
            idade = scanner.nextInt();
        }

        if (idade < 18 ) {
            System.out.println("Menor de Idade = " + idade);
        } else if (idade > 65) {
            System.out.println("Pessoa Idosa = " + idade);
        }else {
            System.out.println("Maior de Idade = " + idade);
        }

    }

}
