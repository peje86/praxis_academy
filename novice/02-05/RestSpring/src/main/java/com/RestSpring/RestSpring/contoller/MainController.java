package com.RestSpring.RestSpring.controller;
// sumber https://github.com/Muhammadakbaar/NewCRUD/tree/master/src/main/java/com/LLBCorp/controller
import com.RestSpring.RestSpring.model.Admin;//mbuhhhhhhhhhhhhhhhhhhhhh
import com.RestSpring.RestSpring.repository.UserRepository;
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
++++++++++++++++++++++++++++++++++++   sampe sini brooo+++++++++++++++++++++++++++



    @PostMapping
    public @ResponseBody User addNewUser (@RequestBody User user){
        return userRepository.save(user);
    }
    
    @GetMapping("/{id}")
    User userById(@PathVariable Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Integer id){
        return userRepository.findById(id)
        .map(user ->{
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            return userRepository.save(newUser);
        }).orElseGet(() -> {
            newUser.setId(id);
            return userRepository.save(newUser);
        });
    }
}