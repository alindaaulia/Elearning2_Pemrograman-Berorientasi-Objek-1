package com.example.elearning2_pbo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InvalidObjectException;

public class Latihan3_FileReading {
    public static void main(String[] args){

        String namaMahasiswa = "";
        int nilaiTertinggi = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("nilai.txt"))){

            String baris;

            while ((baris = reader.readLine()) != null){
                String[] data = baris.split(",");
                String nama = data[0];
                int nilai = Integer.parseInt(data[1]);

                if (nilai > nilaiTertinggi){
                    nilaiTertinggi = nilai;
                    namaMahasiswa = nama;
                }
            }

        } catch (IOException e){
            System.out.println("Terjadi kesalahan pada saat membaca file !!!");
        }

        System.out.println("Mahasiswa dengan nilai tertinggi : ");
        System.out.println(namaMahasiswa + " - " + nilaiTertinggi);
    }

}
