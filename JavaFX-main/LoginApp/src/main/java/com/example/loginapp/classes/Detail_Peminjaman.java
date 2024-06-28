package com.example.loginapp.classes;

public class Detail_Peminjaman {
    private Integer id_detail_peminjaman;
    private Integer jumlah_buku_dipinjam;
    private Integer id_eksemplar;
    private Integer id_peminjaman;

    public Detail_Peminjaman(Integer id_detail_peminjaman, Integer jumlah_buku_dipinjam, Integer id_eksemplar, Integer id_peminjaman) {
        this.id_detail_peminjaman = id_detail_peminjaman;
        this.jumlah_buku_dipinjam = jumlah_buku_dipinjam;
        this.id_eksemplar = id_eksemplar;
        this.id_peminjaman = id_peminjaman;
    }

    public Integer getId_detail_peminjaman() {
        return id_detail_peminjaman;
    }

    public void setId_detail_peminjaman(Integer id_detail_peminjaman) {
        this.id_detail_peminjaman = id_detail_peminjaman;
    }

    public Integer getJumlah_buku_dipinjam() {
        return jumlah_buku_dipinjam;
    }

    public void setJumlah_buku_dipinjam(Integer jumlah_buku_dipinjam) {
        this.jumlah_buku_dipinjam = jumlah_buku_dipinjam;
    }

    public Integer getId_eksemplar() {
        return id_eksemplar;
    }

    public void setId_eksemplar(Integer id_eksemplar) {
        this.id_eksemplar = id_eksemplar;
    }

    public Integer getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(Integer id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }
}
