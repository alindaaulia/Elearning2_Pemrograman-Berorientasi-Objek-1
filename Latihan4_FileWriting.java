package com.example.elearning2_pbo;

import java.io.*;
import java.util.Date;

public class Latihan4_FileWriting {
    public static void main(String[] args){

        String pesan = "Program dijalankan !!! ";

        try (BufferedWriter writer= new BufferedWriter(new FileWriter("log.txt", true))) {

            writer.write(new Date() + " - " + pesan);
            writer.newLine();

            System.out.println("Log berhasil ditulis !!");

        } catch (IOException e){
            System.out.println("Terjad kesalahan saat menulis file !!");
        }
    }
}
