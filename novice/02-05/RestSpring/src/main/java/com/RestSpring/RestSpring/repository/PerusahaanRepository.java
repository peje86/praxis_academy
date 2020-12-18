package com.RestSpring.RestSpring.repository;


import com.praxis.testDBSpringBoot.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerusahaanRepository extends CrudRepository<Perusahaan, Long> {

}