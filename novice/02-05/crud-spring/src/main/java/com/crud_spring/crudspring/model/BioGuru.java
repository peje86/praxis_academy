package com.crud_spring.crudspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guru")
public class BioGuru {
    @Id private String nim;
    private String nama;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim(){
        return nim;
    }


}

