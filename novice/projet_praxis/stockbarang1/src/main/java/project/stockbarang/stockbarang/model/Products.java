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

// import project.absensi.absensi.model.waktu.Waktu;
 

@Entity
@Table(name="product")
public class Products  {
    
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

//     // many to one ke satuan

//     @ManyToOne(optional=false)
//     @JoinColumn(name = "id_satuan", referencedColumnName="id", insertable = false, updatable = false)
//     private Satuans satuan; // object kategorie, mengambil object lain

// public Satuans getSatuan() {
//     return satuan;
//   }
// public void setSatuan(Satuans satuan) {
//     this.satuan = satuan;
// }

//     //setter
// //id satuan
// @NotBlank
// private Integer id_satuan;

// public Integer getIdSatuan() {
//     return id_satuan;
//   }
  
//   public void setIdSatuan(Integer id_satuan) {
//     this.id_satuan = id_satuan;
//   }



//     // many to one ke kategory

//     @ManyToOne(optional=false)
//     @JoinColumn(name = "id_kategori", referencedColumnName="id", insertable = false, updatable = false)
//     private Kategories kategories; // object kategorie, mengambil object lain

// public Kategories getKategories() {
//     return kategories;
//   }
// public void setKategories(Kategories kategories) {
//     this.kategories = kategories;
// }

//     //setter
// //id kategorie
// @NotBlank
// private Integer id_kategori;

// public Integer getIdKategori() {
//     return id_kategori;
//   }
  
//   public void setIdKategori(Integer id_kategori) {
//     this.id_kategori = id_kategori;
//   }




      // nama product

      @NotBlank
      @Size(min=3, max = 50)
      private String nama_product;
   
      public String getNamaProduct(){
          return nama_product;
      }
      public void setNamaProduct(String nama_product){
          this.nama_product = nama_product;
      }

   

      // berat

    @NotBlank
    private String netto;
  
    public String getNetto(){
        return netto;
    }
    public void setNetto(String netto){
        this.netto = netto;
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