package praxis.login.formlogin.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="users")
public class User {


    //////////////////////////
    @ManyToMany
    private Set<Role> roles;
 
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    //////////////////



    ///////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
///////////////////////


////////////////////////////////////
    private String username;
///////////////////////////////

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}


//////////////////////////////////
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    ///////////////////////

    @Transient
    private String passwordConfirm;
    //////////////////////////////////
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }


    //////////////////////////////////////

 
}