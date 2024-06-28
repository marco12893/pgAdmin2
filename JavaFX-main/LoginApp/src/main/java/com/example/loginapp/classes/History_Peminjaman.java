package com.example.loginapp.classes;

import java.sql.Date;

public class History_Peminjaman {
    private Integer id_peminjaman;
    private Integer nij;
    private Date tanggal_pinjam;
    private Date batas_pengembalian;
    private Date tanggal_pengembalian;
    private Integer perpanjangan_ke;
    private String denda_yon;
    private Integer biaya_denda;
    private String ganti_buku;
    private Integer biaya_penggantian;

    public History_Peminjaman(Integer id_peminjaman, Integer nij, Date tanggal_pinjam, Date batas_pengembalian, Date tanggal_pengembalian, Integer perpanjangan_ke, String denda_yon, Integer biaya_denda, String ganti_buku, Integer biaya_penggantian) {
        this.id_peminjaman = id_peminjaman; //
        this.nij = nij; //
        this.tanggal_pinjam = tanggal_pinjam;  //
        this.batas_pengembalian = batas_pengembalian; //
        this.tanggal_pengembalian = tanggal_pengembalian;
        this.perpanjangan_ke = perpanjangan_ke; //
        this.denda_yon = denda_yon; //
        this.biaya_denda = biaya_denda;
        this.ganti_buku = ganti_buku; //
        this.biaya_penggantian = biaya_penggantian;
    }

    public History_Peminjaman(Integer id_peminjaman, Integer nij, Date tanggal_pinjam, Date batas_pengembalian, Integer perpanjangan_ke, String denda_yon, String ganti_buku) {
        this.id_peminjaman = id_peminjaman;
        this.nij = nij;
        this.tanggal_pinjam = tanggal_pinjam;
        this.batas_pengembalian = batas_pengembalian;
        this.perpanjangan_ke = perpanjangan_ke;
        this.denda_yon = denda_yon;
        this.ganti_buku = ganti_buku;

        this.tanggal_pengembalian = null;
        this.biaya_denda = null;
        this.biaya_penggantian = null;
    }

    public History_Peminjaman(Integer id_peminjaman, Integer nij, Date tanggal_pinjam, Date batas_pengembalian, Date tanggal_pengembalian, Integer perpanjangan_ke, String denda_yon, String ganti_buku) {
        this.id_peminjaman = id_peminjaman;
        this.nij = nij;
        this.tanggal_pinjam = tanggal_pinjam;
        this.batas_pengembalian = batas_pengembalian;
        this.tanggal_pengembalian = tanggal_pengembalian;
        this.perpanjangan_ke = perpanjangan_ke;
        this.denda_yon = denda_yon;
        this.ganti_buku = ganti_buku;

        this.biaya_denda = null;
        this.biaya_penggantian = null;
    }

    public History_Peminjaman(Integer id_peminjaman, Integer nij, Date tanggal_pinjam, Date batas_pengembalian, Date tanggal_pengembalian, Integer perpanjangan_ke, String denda_yon, Integer biaya_denda, String ganti_buku) {
        this.id_peminjaman = id_peminjaman;
        this.nij = nij;
        this.tanggal_pinjam = tanggal_pinjam;
        this.batas_pengembalian = batas_pengembalian;
        this.tanggal_pengembalian = tanggal_pengembalian;
        this.perpanjangan_ke = perpanjangan_ke;
        this.denda_yon = denda_yon;
        this.biaya_denda = biaya_denda;
        this.ganti_buku = ganti_buku;

        this.biaya_penggantian = null;
    }

    public History_Peminjaman(Integer id_peminjaman, Integer nij, Date tanggal_pinjam, Date batas_pengembalian, Date tanggal_pengembalian, Integer perpanjangan_ke, String denda_yon, String ganti_buku, Integer biaya_penggantian) {
        this.id_peminjaman = id_peminjaman;
        this.nij = nij;
        this.tanggal_pinjam = tanggal_pinjam;
        this.batas_pengembalian = batas_pengembalian;
        this.tanggal_pengembalian = tanggal_pengembalian;
        this.perpanjangan_ke = perpanjangan_ke;
        this.denda_yon = denda_yon;
        this.ganti_buku = ganti_buku;
        this.biaya_penggantian = biaya_penggantian;

        this.biaya_denda = null;
    }
}
