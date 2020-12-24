
// Creating the Repositories for accessing User and Role data

// Now that we have defined the domain models, 
// Let’s create the repositories for persisting these 
// domain models to the database and retrieving them.

// All the repositories will go inside a package named 
// repository. So let’s first create the repository
// package inside com.example.polls.
// 1. UserRepository

// Following is the complete code for UserRepository 
//interface. It extends Spring Data JPA’s JpaRepository interface.

// package com.example.polls.repository;

// import com.example.polls.model.User;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
// import java.util.List;
// import java.util.Optional;

// @Repository
// public interface UserRepository extends JpaRepository<User, Long> {
//     Optional<User> findByEmail(String email);

//     Optional<User> findByUsernameOrEmail(String username, String email);

//     List<User> findByIdIn(List<Long> userIds);

//     Optional<User> findByUsername(String username);

//     Boolean existsByUsername(String username);

//     Boolean existsByEmail(String email);
// }
