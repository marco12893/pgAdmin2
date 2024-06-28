package com.example.loginapp.classes;

import java.sql.Date;

public class Data_Jemaat {
    private Integer nij;
    private String nama;
    private String tempat_lahir;
    private Date tanggal_lahir;
    private String alamat;
    private String no_tlp;
    private String kontak_ortu;
    private String member_perpustakaan_yon;

    public Data_Jemaat(Integer nij, String nama, String tempat_lahir, Date tanggal_lahir, String alamat, String no_tlp, String kontak_ortu, String member_perpustakaan_yon) {
        this.nij = nij;
        this.nama = nama;
        this.tempat_lahir = tempat_lahir;
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
        this.no_tlp = no_tlp;
        this.kontak_ortu = kontak_ortu;
        this.member_perpustakaan_yon = member_perpustakaan_yon;
    }

    public Integer getNij() {
        return nij;
    }

    public void setNij(Integer nij) {
        this.nij = nij;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }

    public String getKontak_ortu() {
        return kontak_ortu;
    }

    public void setKontak_ortu(String kontak_ortu) {
        this.kontak_ortu = kontak_ortu;
    }

    public String getMember_perpustakaan_yon() {
        return member_perpustakaan_yon;
    }

    public void setMember_perpustakaan_yon(String member_perpustakaan_yon) {
        this.member_perpustakaan_yon = member_perpustakaan_yon;
    }
}
