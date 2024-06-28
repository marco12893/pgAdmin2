package com.example.loginapp.classes;

public class Buku {
    private String isbn;
    private String nama;
    private Integer halaman;
    private Integer edisi;
    private Integer harga;
    private Integer tahun_terbit;
    private String penerbit;
    private Integer stok;

    public Buku(String isbn, String nama, Integer halaman, Integer edisi, Integer harga, Integer tahun_terbit, String penerbit, Integer stok) {
        this.isbn = isbn;
        this.nama = nama;
        this.halaman = halaman;
        this.edisi = edisi;
        this.harga = harga;
        this.tahun_terbit = tahun_terbit;
        this.penerbit = penerbit;
        this.stok = stok;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getHalaman() {
        return halaman;
    }

    public void setHalaman(Integer halaman) {
        this.halaman = halaman;
    }

    public Integer getEdisi() {
        return edisi;
    }

    public void setEdisi(Integer edisi) {
        this.edisi = edisi;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(Integer tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
}
