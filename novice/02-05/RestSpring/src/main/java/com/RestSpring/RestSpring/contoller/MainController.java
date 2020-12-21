package com.RestSpring.RestSpring.controller;
// sumber https://github.com/Muhammadakbaar/NewCRUD/tree/master/src/main/java/com/LLBCorp/controller
import com.RestSpring.RestSpring.model.Admin;//mbuhhhhhhhhhhhhhhhhhhhhh
import com.RestSpring.RestSpring.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/admin")
public class MainController {
    @Autowired
    public AdminRepository adminRepository;

    @GetMapping
    public @ResponseBody Iterable<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }
    @PostMapping
    public @ResponseBody Admin addNewAdmin (@RequestBody Admin admin){
        return adminRepository.save(admin);
    }
    
    @GetMapping("/{id}")
    Admin adminById(@PathVariable Integer id) {
        return adminRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable Integer id){
        adminRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    Admin updateAdmin(@RequestBody Admin newAdmin, @PathVariable Integer id){
        return adminRepository.findById(id)
        .map(admin ->{
            admin.setName(newAdmin.getName());
            admin.setEmail(newAdmin.getEmail());
            return adminRepository.save(newAdmin);
        }).orElseGet(() -> {
            newAdmin.setId(id);
            return adminRepository.save(newAdmin);
        });
    }
}