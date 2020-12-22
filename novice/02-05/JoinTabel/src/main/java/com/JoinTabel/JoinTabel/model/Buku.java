package com.JoinTabel.JoinTabel.model;
 
 //sumber https://agung-setiawan.com/dao-pada-join-tabel/
/**
 *
 * @author Agung Setiawan
 */
public class Buku {
    private Integer id;
    private String judul;
    private String penulis;
    private Kategori kategori;
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getJudul() {
        return judul;
    }
 
    public void setJudul(String judul) {
        this.judul = judul;
    }
 
    public String getPenulis() {
        return penulis;
    }
 
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
 
    public Kategori getKategori() {
        return kategori;
    }
 
    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }   
}