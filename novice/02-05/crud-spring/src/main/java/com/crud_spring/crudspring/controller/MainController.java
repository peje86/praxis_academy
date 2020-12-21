package com.crud_spring.crudspring.controller;

import java.lang.reflect.Array;
import java.util.Optional;

import com.crud_spring.crudspring.model.BioGuru;
import com.crud_spring.crudspring.resource.MyResource;

import org.aspectj.weaver.ast.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//import antlr.collections.List;

@RestController
@RequestMapping(path="/") //kalau memanggil demo hanya memangil classnya saja
public class MainController {
    @Autowired
    private MyResource myResource;
    //get, post, get all, get id, post, update


// 1.  memanggil semua data
@GetMapping (path="/guru") //memanggil method tampil data
public  java.util.List<BioGuru> get_All() {  //bio guru diambil dari tabel nama class di model
    return myResource.findAll();
}
 
//2. post data ke tabel database

@GetMapping(path="/get_nim/{nim}")//tipe bio mahasiswaa
public Optional<BioGuru> nimBioGuru(@PathVariable String nim){
    return myResource.findById(nim);
}


}