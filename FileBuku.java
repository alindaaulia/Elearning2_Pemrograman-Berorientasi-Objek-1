package com.example.elearning2_pbo;

import java.io.*;
import java.util.ArrayList;

public class FileBuku {

    static String namafile = "buku.txt";

    public static void simpanBuku(Buku buku) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namafile, true))) {
            writer.write(buku.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Gagal menyimpan buku !!");
        }
    }

    public static ArrayList<Buku> bacaBuku(){
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(namafile))){
            String baris;

            while ((baris = reader.readLine()) != null){
                String[] data = baris.split(",");
                String judul = data[0].trim();
                String pengarang = data[1].trim();
                int tahun = Integer.parseInt(data[2].trim());
                StatusBuku status = StatusBuku.valueOf(data[3].trim());

                Buku buku = new Buku(judul, pengarang, tahun, status);

                daftarBuku.add(buku);
            }
        } catch (IOException e) {
            System.out.println("File belum ada");
        }

        return daftarBuku;
    }
}
