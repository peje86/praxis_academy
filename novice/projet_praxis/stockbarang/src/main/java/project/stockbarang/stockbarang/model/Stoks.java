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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
 
import org.hibernate.annotations.NaturalId;

// import project.absensi.absensi.model.waktu.Waktu;
 

@Entity
@Table(name="stok_produk")
public class Stoks  {
    
    // id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // many to one ke satuan

    @ManyToOne(optional=false)
    @JoinColumn(name = "id_product", referencedColumnName="id", insertable = false, updatable = false)
    private Products products; // object kategorie, mengambil object lain

public Products getProducts() {
    return products;
  }
public void setProducts(Products products) {
    this.products = products;
}

    //setter
//id satuan
//@NotBlank
private Integer id_product;

public Integer getIdProduct() {
    return id_product;
  }
  
  public void setIdProduct(Integer id_product) {
    this.id_product = id_product;
  }




   // many to one ke user

   @ManyToOne(optional=false)
   @JoinColumn(name = "id_user", referencedColumnName="id", insertable = false, updatable = false)
   private User user; // object kategorie, mengambil object lain

public User getUser() {
   return user;
 }
public void setUser(User user) {
   this.user = user;
}

   //setter
//id satuan
//@NotBlank
private Integer id_user;

public Integer getIdUser() {
   return id_user;
 }
 
 public void setIdUser(Integer id_user) {
   this.id_user = id_user;
 }




      // jumlah

    //@NotBlank
    private String jumlah;
  
    public String getJumlah(){
        return jumlah;
    }
    public void setJumlah(String jumlah){
        this.jumlah = jumlah;
    }





    // @ManyToMany(fetch = FetchType.LAZY)
    // @JoinTable(name = "record_absen", 
    //   joinColumns = @JoinColumn(name = "user_id"), 
    //   inverseJoinColumns = @JoinColumn(name = "absen_id"))
    // private Set<User> users = new HashSet<>();
 
    // // file untuk setter getter many to many
 
    // public Set<User> getUsers() {
    //     return users;
    // }
 
    // public void setUsers(Set<User> users) {
    //     this.users = users;
    // }


}