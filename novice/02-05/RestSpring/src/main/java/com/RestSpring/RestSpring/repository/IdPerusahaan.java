package com.RestSpring.RestSpring.repository;


import com.RestSpring.RestSpring.model.Perusahaan;

import java.util.Optional;

public interface IdPerusahaan {

    Optional<Perusahaan> findById(Long id);
}