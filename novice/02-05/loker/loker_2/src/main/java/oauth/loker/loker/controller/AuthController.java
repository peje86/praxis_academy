package oauth.loker.loker.controller;

import oauth.loker.loker.exception.AppException;
import oauth.loker.loker.model.Role;
import oauth.loker.loker.model.RoleName;
import oauth.loker.loker.model.User;
import oauth.loker.loker.payload.ApiResponse;
import oauth.loker.loker.payload.JwtAuthenticationResponse;

import oauth.loker.loker.payload.SignUpRequest;
import oauth.loker.loker.repository.RoleRepository;
import oauth.loker.loker.repository.UserRepository;
import oauth.loker.loker.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenProvider tokenProvider;

    // post sign in
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
        if(userRepository.existsByUsername(signUpRequest.getUsername())) {
            return new ResponseEntity(new ApiResponse(false, "Username is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }

        if(userRepository.existsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity(new ApiResponse(false, "Email Address already in use!"),
                    HttpStatus.BAD_REQUEST);
        }

        // // Creating user's account
        // User user = new User(signUpRequest.getName(), signUpRequest.getUsername(),
        //         signUpRequest.getEmail(), signUpRequest.getPassword());

        // user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
        //         .orElseThrow(() -> new AppException("User Role not set."));

        // user.setRoles(Collections.singleton(userRole));

        // User result = userRepository.save(user);

        // URI location = ServletUriComponentsBuilder
        //         .fromCurrentContextPath().path("/api/users/{username}")
        //         .buildAndExpand(result.getUsername()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));
    }
}
