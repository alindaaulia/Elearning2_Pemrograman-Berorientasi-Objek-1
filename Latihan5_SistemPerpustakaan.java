package com.example.elearning2_pbo;

import java.util.ArrayList;

public class Latihan5_SistemPerpustakaan {
    public static void main(String[] args){

        Buku buku1 = new Buku("Pembahasan Rekayasa perangkat Lunak", "Cinta", 2025, StatusBuku.DIPINJAM);

        FileBuku.simpanBuku(buku1);

        ArrayList<Buku> daftar = FileBuku.bacaBuku();

        System.out.println("Daftar Buku : ");
        for (Buku b : daftar){
            System.out.println(b.judul + " - " + b.status);
        }

        //Cari buku berdasarkan judul
        String cari = " Pembahasan Pemrograman Java";
        for (Buku b : daftar){
            if (b.judul.equalsIgnoreCase(cari)){
                System.out.println("Buku ditemukan : " + b.judul);
            }
        }
    }
}



enum StatusBuku {
    TERSEDIA,
    DIPINJAM
}
