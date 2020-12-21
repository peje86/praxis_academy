package com.RestSpring.RestSpring.controller;


import com.RestSpring.RestSpring.model.Perusahaan;
import com.RestSpring.RestSpring.repository.PerusahaanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import java.util.Optional;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping("/perusahaan")
public class PerusahaanController {

    @Autowired
    public PerusahaanRepository perusahaanRepository;

    @GetMapping("/")
    public @ResponseBody List<Perusahaan> getAllPerusahaan() {
        return perusahaanRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Perusahaan getByNomorPerusahaan(@PathVariable("id") Long nomor_perusahaan){
        return perusahaanRepository.findByNomorPerusahaan(nomor_perusahaan).get();

    }

    @PostMapping("/")
    // @PostMapping("/")     //salah kode
    public Perusahaan addNewPerusahaan(@RequestBody Perusahaan perusahaan){
        return perusahaanRepository.save(perusahaan);
    }

    

    @DeleteMapping("/{id}")
    public String deletePerusahaan(@PathVariable("id") Long nomor_perusahaan){
        Perusahaan perusahaan = perusahaanRepository.findByNomorPerusahaan(nomor_perusahaan).get();
        perusahaanRepository.delete(perusahaan);
        return "Terhapus";
    }

    @PutMapping("/{id}")
    public Perusahaan update(@PathVariable("id") Long nomor_perusahaan, @RequestBody Perusahaan newPerusahaan) {
        Perusahaan perusahaan = perusahaanRepository.findByNomorPerusahaan(nomor_perusahaan).get();
        perusahaan.setNamaPerusahaan(newPerusahaan.getNamaPerusahaan());
      return perusahaanRepository.save(perusahaan);
    }
} 