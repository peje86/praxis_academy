package com.crud_spring.crudspringjoin2tabel.repositories;

import com.crud_spring.crudspringjoin2tabel.model.Library;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long>{

    
}

   