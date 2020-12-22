package com.crud_spring.crudspringjoin2tabel.controller;

// sumber  https://github.com/hamkasatria/praxis-academy/tree/master/novice/02-05/relationshipdata


import com.crud_spring.crudspringjoin2tabel.repositories.AddressRepository;
import com.crud_spring.crudspringjoin2tabel.repositories.LibraryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/trial")
public class MainController {
    @Autowired
    private AddressRepository addressrepository;

    @Autowired
    private LibraryRepository libraryRepository;

    


}