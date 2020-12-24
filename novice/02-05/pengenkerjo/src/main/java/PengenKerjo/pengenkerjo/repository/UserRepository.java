package PengenKerjo.pengenkerjo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import PengenKerjo.pengenkerjo.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> { //users diambil dari nama class dari folder model
  
}