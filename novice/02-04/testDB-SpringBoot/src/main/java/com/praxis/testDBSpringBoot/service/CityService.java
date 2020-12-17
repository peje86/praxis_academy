package com.praxis.testDBSpringBoot.service;

import com.praxis.testDBSpringBoot.model.City;
import com.praxis.testDBSpringBoot.repository.CityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {

        var cities = (List<City>) repository.findAll();

        return cities;
    }
}