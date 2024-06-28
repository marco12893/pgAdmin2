package com.example.loginapp.classes;

public class Eksemplar {
    private int id_eksemplar;
    private String isbn_buku;

    public Eksemplar(int id_eksemplar, String isbn_buku) {
        this.id_eksemplar = id_eksemplar;
        this.isbn_buku = isbn_buku;
    }

    public int getId_eksemplar() {
        return id_eksemplar;
    }

    public void setId_eksemplar(int id_eksemplar) {
        this.id_eksemplar = id_eksemplar;
    }

    public String getIsbn_buku() {
        return isbn_buku;
    }

    public void setIsbn_buku(String isbn_buku) {
        this.isbn_buku = isbn_buku;
    }
}
