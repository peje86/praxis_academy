package com.RestSpring.RestSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.RestSpring.RestSpring.model.Perusahaan;

@Repository
public interface PerusahaanRepository extends JpaRepository<Perusahaan, Long>{
    // List<Perusahaan> findAll();
    // Perusahaan save(Perusahaan perusahaan);
    // Perusahaan updatePerusahaan(Long nomor_perusahaan, Perusahaan perusahaan);
    Optional<Perusahaan> findByNomorPerusahaan(Long nomor_perusahaan);
    // void deleteByNomorPerusahaan(Long nomor_perusahaan);
    // Perusahaan findByNomorPerusahaan(Long nomor_perusahaan);

}