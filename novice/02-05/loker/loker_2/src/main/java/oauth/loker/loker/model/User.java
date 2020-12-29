package oauth.loker.loker.model;

//import package
import oauth.loker.loker.model.audit.DateAudit;
import org.hibernate.annotations.NaturalId;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
///////////////////


// membuat tabel
@Entity
@Table  (
    // nama tabel users, dengan username unique dan email unique contraint
    name = "users", 
    uniqueConstraints = {
        @UniqueConstraint(columnNames ="username"),
        @UniqueConstraint(columnNames = "email")
                        }
        )
/////////////////////////



public class User extends DateAudit  {

    // atribut dari user (id,name,username,email,password)
  //1. atribut id
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //menuju ke setter getter u/ ngeset setter getter
    //2. atribut nama nama tidak boleh kosong , max nama 40 karakter
    @NotBlank
    @Size(max = 40)
    private String name;
    //menuju ke setter getter u/ ngeset setter getter

    //3. atribut username notblank, size 15 karakter
    @NotBlank
    @Size(max = 15)
    private String username;
    //menuju ke setter getter u/ ngeset setter getter

  //4. atribut email 
    @NaturalId
    @NotBlank
    @Size(max = 40)
    @Email
    private String email;
      //menuju ke setter getter u/ ngeset setter getter

    // atribut password
    @NotBlank
    @Size(max = 100)
    private String password;
  //menuju ke setter getter u/ ngeset setter getter

  // many to Many user dengan role 
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();


// setter getter role
public Set<Role> getRoles() {
    return roles;
}

public void setRoles(Set<Role> roles) {
    this.roles = roles;
}

//////////////////////////////////////////

    public User() {
        // dikosongkan

    }

    public User(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }


    // setter getter

    //setter getter id
private Long getId(){
    return id;
}
private void setId(Long id){
    this.id = id;
}
// setter getter name
private String getName(){
    return name;
}
private void setName(String name){
    this.name = name;
}

//setter getter username
private String getUsername(){
    return username;
}
private void setUsername(String username){
    this.username = username;
}

//setter getter email
private String getEmail(){
    return email;
}
private void setEmail(String email){
    this.email = email;
}

//settergetter password
private String getPassword(){
    return password;
}
private void setPassword(String password){
    this.password = password;
}



}

