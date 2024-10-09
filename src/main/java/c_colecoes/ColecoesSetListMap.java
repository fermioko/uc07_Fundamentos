package c_colecoes;

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

//        Map<Integer,String> mapa = new HashMap<>();
//
//        mapa.add(100, "Battle Royale");
//        mapa.add(200, "Another");
//        mapa.add(300, "Ghost Hunt");
//        mapa.add(400, "Death Note");
//
//        for (){
//
//        }

    }
}

//for (String chave : mapa.keySet()) {
//System.out.println("Fruta: " + chave + " - Quantidade: " + mapa.get(chave));
//Sugestão List<String> lista = new ArrayList<>(),
// Set<String> conjunto = new HashSet<>() e
// Map<Integer,String> mapa = new HashMap<>().
// Obs: Set não permite duplicidades

