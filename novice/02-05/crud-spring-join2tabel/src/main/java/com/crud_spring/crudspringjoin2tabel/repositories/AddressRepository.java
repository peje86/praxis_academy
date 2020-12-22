package com.crud_spring.crudspringjoin2tabel.repositories;

import com.crud_spring.crudspringjoin2tabel.model.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long>{

    
}