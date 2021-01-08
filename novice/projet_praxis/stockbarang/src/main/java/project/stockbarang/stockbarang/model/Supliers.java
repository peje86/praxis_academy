package project.stockbarang.stockbarang.model;


import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
 
import org.hibernate.annotations.NaturalId;


@Entity
@Table(name = "suplier", uniqueConstraints = {
    @UniqueConstraint(columnNames = {
        "telepon"
    }),
    @UniqueConstraint(columnNames = {
        "email"
    })
})
public class Supliers  {
    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 

    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }

    //TELEPON
    @NotBlank
    @Size(min=3, max = 50)
    private String telepon;
//
    public String getTelepon() {
        return telepon;
    }
 
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    // ALAMAT

    @NotBlank
    @Size(min=3, max = 50)
    private String alamat;

    public String getAlamat() {
        return alamat;
    }
 
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
 
    //NAME

    @NotBlank
    @Size(min=3, max = 50)
    private String name;

    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    // EMAIL


    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
 

    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }



}