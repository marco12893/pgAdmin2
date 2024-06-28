package com.example.loginapp.classes;

public class Ditulis {
    private Integer nomor_urut;
    private String fk_isbn;
    private Integer fk_penulis;

    public Ditulis(Integer nomor_urut, String fk_isbn, Integer fk_penulis) {
        this.nomor_urut = nomor_urut;
        this.fk_isbn = fk_isbn;
        this.fk_penulis = fk_penulis;
    }

    public Integer getNomor_urut() {
        return nomor_urut;
    }

    public void setNomor_urut(Integer nomor_urut) {
        this.nomor_urut = nomor_urut;
    }

    public String getFk_isbn() {
        return fk_isbn;
    }

    public void setFk_isbn(String fk_isbn) {
        this.fk_isbn = fk_isbn;
    }

    public Integer getFk_penulis() {
        return fk_penulis;
    }

    public void setFk_penulis(Integer fk_penulis) {
        this.fk_penulis = fk_penulis;
    }
}
