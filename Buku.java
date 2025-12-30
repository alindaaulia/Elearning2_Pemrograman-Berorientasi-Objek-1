package com.example.elearning2_pbo;

public class Buku {

    String judul;
    String pengarang;
    int tahun;
    StatusBuku status;

    public Buku(String judul, String pengarang, int tahun, StatusBuku status){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun = tahun;
        this.status = status;
    }

    @Override
    public String toString() {
        return judul + ", " + pengarang + ", " + tahun + ", " + status;
    }
}
