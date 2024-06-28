package com.example.loginapp.classes;

public class Penulis {
    private Integer id_penulis;
    private String nama;
    private String email;

    public Penulis(Integer id_penulis, String nama, String email) {
        this.id_penulis = id_penulis;
        this.nama = nama;
        this.email = email;
    }

    public Penulis(Integer id_penulis, String nama) {
        this.id_penulis = id_penulis;
        this.nama = nama;
        this.email=null;
        // karena email gak wajib
    }

    public Integer getId_penulis() {
        return id_penulis;
    }

    public void setId_penulis(Integer id_penulis) {
        this.id_penulis = id_penulis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
