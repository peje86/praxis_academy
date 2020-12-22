package PengenKerjo.pengenkerjo.contoller;

import PengenKerjo.pengenkerjo.model.Users;
import PengenKerjo.pengenkerjo.repository.UserRepository;
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
@RequestMapping("/users")
public class MainController {
    //autowired berfungsi membaca class dari file yg dipanggil
    @Autowired//mengambil class dari userrepository
    public UserRepository user_repository;

    @GetMapping
    public @ResponseBody Iterable<Users> getAllUsers() {
        return user_repository.findAll();
    }
}