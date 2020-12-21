
package com.RestSpring.RestSpring.repository;

import org.springframework.data.repository.CrudRepository;

import com.RestSpring.RestSpring.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
  
}