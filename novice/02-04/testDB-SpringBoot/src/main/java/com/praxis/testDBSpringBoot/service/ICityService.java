package com.praxis.testDBSpringBoot.service;

import com.praxis.testDBSpringBoot.model.City;

import java.util.List;

public interface ICityService {

    List<City> findAll();
}