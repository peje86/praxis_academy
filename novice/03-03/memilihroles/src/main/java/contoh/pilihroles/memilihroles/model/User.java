package contoh.pilihroles.memilihroles.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class User{

    //many to many cassade dan join tabel
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
			)
	private Set<Role> roles = new HashSet<>(); 

    //setter getter
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}	

    ///////////////////


    @Id 
    @Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id =id;
    }


    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.nama=name;
    }

    private String email;

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    private String password;
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }


    private boolean enabled;
    public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
