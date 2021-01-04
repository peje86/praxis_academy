package praxis.login.formlogin.service;


import praxis.login.formlogin.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}