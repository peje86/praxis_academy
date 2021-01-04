package praxis.login.formlogin.service;


public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
