package com.crud_spring.crudspringjoin2tabel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
    @Id@GeneratedValue
    private long id;


    @Column(nullable = false)
    private String location;

    @OneToOne(mappedBy = "address")
    private Library library;

    void setLocation(String loc){
        this.location = loc;
    }

    String getLocation() {
        return location;
    }

}

