package PengenKerjo.pengenkerjo.repository;

import org.springframework.data.repository.CrudRepository;

import PengenKerjo.pengenkerjo.model.Users;

public interface UserRepository 
extends CrudRepository<Users, Integer> { //users diambil dari nama class dari folder model
  
}