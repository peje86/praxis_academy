
package com.JoinTabel.JoinTabel.model;
 
import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author Agung Setiawan
 */
public class Kategori {
    private Integer id;
    private String nama;
    List<Buku> daftarBuku=new ArrayList<Buku>();
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }
 
    public void setDaftarBuku(List<Buku> daftarBuku) {
        this.daftarBuku = daftarBuku;
    }   
}