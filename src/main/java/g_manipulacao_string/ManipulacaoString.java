package g_manipulacao_string;

import java.util.Scanner;

public class ManipulacaoString {

    public static void main(String[] args) {

        Scanner scannerms = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scannerms.nextLine();

        // número de caracteres da frase
        System.out.println("Número de caracteres: " + frase.length());

        // frase para letras maiúsculas
        String fraseMaiuscula = frase.toUpperCase();
        System.out.println("Frase em maiúsculas: " + fraseMaiuscula);

        // Substituir todas as ocorrências de uma palavra por outra
        System.out.print("Digite a palavra que deseja substituir: ");
        String palavraAntiga = scannerms.nextLine();
        System.out.print("Digite a nova palavra: ");
        String palavraNova = scannerms.nextLine();
        String fraseSubstituida = frase.replace(palavraAntiga, palavraNova);
        System.out.println("Frase após substituição: " + fraseSubstituida);

    }
}

