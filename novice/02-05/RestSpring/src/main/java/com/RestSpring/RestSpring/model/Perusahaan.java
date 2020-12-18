package com.RestSpring.RestSpring.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="perusahaan")
public class Perusahaan {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long nomorPerusahaan;

    private String namaPerusahaan;

    public Long getNomorPerusahaan() {
        return nomorPerusahaan;
    }
    public void setNomorPerusahaan(Long nomorPerusahaan){
        this.nomorPerusahaan = nomorPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
    public void setNamaPerusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
    }
}