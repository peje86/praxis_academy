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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
 
import org.hibernate.annotations.NaturalId;




@Entity
@Table(name="stok_produk")

public class StockProducts {

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
   

    @NotBlank
    private Long jumlah;

    public Long getJumlah (){
        return jumlah;
    }
    public void setJumlah (Long jumlah){
        this.jumlah=jumlah;
    }

    @NotBlank
    private String satuan;

    public String getSatuan (){
        return satuan;
    }
    public void setSatuan (String satuan){
        this.satuan=satuan;
    }





//     // many to one ke product

//     @ManyToOne(optional=false)
//     @JoinColumn(name = "id_product", referencedColumnName="id", insertable = false, updatable = false)
//     private Products products;

// public Products getProducts() {
//     return products;
//   }

//     //setter
// //id kategorie
// @NotBlank
// private String id_product;

// public String getIdProduct() {
//     return id_product;
//   }
  
//   public void setIdProduct(String id_product) {
//     this.id_product = id_product;
//   }
  
//     // many to one ke user

//     @ManyToOne(optional=false)
//     @JoinColumn(name = "inputBy", referencedColumnName="id", insertable = false, updatable = false)
//     private User user;

// public User getUser() {
//     return user;
//   }

//     //setter
// //id user
// @NotBlank
// private String id_user;

// public String getIdUser() {
//     return id_user;
//   }
  
//   public void setIdUser(String id_user) {
//     this.id_user = id_user;
//   }



}