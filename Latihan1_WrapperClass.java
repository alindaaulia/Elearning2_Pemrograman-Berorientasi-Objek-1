package com.example.elearning2_pbo;

import java.util.ArrayList;

public class Latihan1_WrapperClass {
    public static void main(String[] args){
        //ArrayList String (Data Awal)
        ArrayList<String> angkaString = new ArrayList<>();
        angkaString.add("5");
        angkaString.add("6");
        angkaString.add("7");

        //ArrayList Integer (Hasil konversi)
        ArrayList<Integer> angkaInteger = new ArrayList<>();

        //Proses konversi
        for (String s : angkaString){
            Integer angka = Integer.parseInt(s);
            angkaInteger.add(angka);
        }

        //output
        System.out.println("Data String : " + angkaString);
        System.out.println("Data Integer : " + angkaInteger);
    }
}
