package com.RestSpring.RestSpring.repository;

import com.RestSpring.RestSpring.model.Perusahaan;
import com.RestSpring.RestSpring.repository.PerusahaanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Perusahaan implements IdPerusahaan {


    //perusahaan contains the implementation of the findById() method.
    // We use the repository to retrieve data from the database. 
    @Autowired
    private PerusahaanRepository perusahaanRepository;

    @Override
    public Optional<perusahaan> findById(Long id) {

        return perusahaanRepository.findById(id);// CityRepository is injected. 
    }
}