
package com.crud_spring.crudspring.resource;

import com.crud_spring.crudspring.model.BioGuru;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyResource extends JpaRepository<BioGuru ,String> {  //mengambil data dari depedency

}