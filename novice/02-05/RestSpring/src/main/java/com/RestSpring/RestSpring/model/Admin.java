package com.RestSpring.RestSpring.model;

import com.RestSpring.RestSpring.model.Perusahaan;
import javax.persistence.Entity;
import javax.persistence.Table  ;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="admin")
public class Admin {

    @ManyToOne(optional=false)
    @JoinColumn(name = "nomorPerusahaan", referencedColumnName="nomorPerusahaan", insertable = false, updatable = false)
    private Perusahaan perusahaan;

    private Long nomorPerusahaan;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }

    private String name;

    private String email;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public Long getNomorPerusahaan() {
        return nomorPerusahaan;
    }

    public void setNomorPerusahaan(Long nomorPerusahaan) {
        this.nomorPerusahaan = nomorPerusahaan;
    }

    public void setEmail(String email){
        this.email = email;
    }
}