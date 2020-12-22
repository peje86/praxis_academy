package com.crud_spring.crudspringjoin2tabel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//import javax.persistence.RestResources;
import javax.persistence.Table;


@Entity
@Table(name = "Library")
public class Library {
    @Id
    @GeneratedValue
    private long id;

    @Column //apakah harus ada anotasi?
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    //@RestResources(path = "libraryAddress", rel = "address")
    private Address address;

    void setName(final String name) {
        this.name = name;
    }

    String getName(){
        return name;
    }

}