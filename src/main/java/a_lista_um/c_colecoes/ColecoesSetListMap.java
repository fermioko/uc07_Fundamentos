package a_lista_um.c_colecoes;

import java.util.*;

public class ColecoesSetListMap {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Mioko");
        lista.add("Midori");
        lista.add("Yukari");
        lista.add("Sayuri");

        for (String nome : lista ){
            System.out.println("List Nome: " + nome);
        }

        System.out.println("\n");

        Set<String> conjunto = new HashSet<>();

        conjunto.add("Mamamoo");
        conjunto.add("BTS");
        conjunto.add("Black Pink");
        conjunto.add("Super Junior");
        conjunto.add("BTS");

        for (String kpop : conjunto){
            System.out.println("Set Kpop: " + kpop);
        }

        System.out.println("\n");

        Map<Integer,String> mapa = new HashMap<>();

        mapa.put(100, "Battle Royale");
        mapa.put(200, "Another");
        mapa.put(300, "Ghost Hunt");
        mapa.put(400, "Death Note");

        System.out.println("Mapa = " + mapa);

    }
}

//for (String chave : mapa.keySet()) {
//System.out.println("Fruta: " + chave + " - Quantidade: " + mapa.get(chave));
//Sugestão List<String> lista = new ArrayList<>(),
// Set<String> conjunto = new HashSet<>() e
// Map<Integer,String> mapa = new HashMap<>().
// Obs: Set não permite duplicidades

// Map - Lista com Chave/Valor
// Map<Integer, String> mapaCidade = new HashMap<>();
// mapaCidade.put(1, "Araraquara");
// mapaCidade.put(2, "Sao Paulo");
// mapaCidade.put(3, "Americo Brasiliense");
// System.out.println("Mapa = " + mapaCidade);    }}
