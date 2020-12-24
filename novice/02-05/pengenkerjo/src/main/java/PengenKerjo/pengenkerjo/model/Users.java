package PengenKerjo.pengenkerjo.model;


import PengenKerjo.pengenkerjo.model.Pendidikan;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;




@Entity
@Table(name="users")
public class Users {

    // memanggil method join manytoOne
    @ManyToOne(optional=false)
    @JoinColumn(name = "id_pendidikan", referencedColumnName="id_pendidikan", insertable = false, updatable = false)
    private Pendidikan pendidikan;
   // End method pemanggilan
 


   //setelah memanggil method join kita mendapatkan id_pendidikan
    public Integer id_pendidikan;

   //setter getter id
   public Integer getIdPendidikan(){
       return id_pendidikan;
   }
   public void setIdPendidikan(Integer id_pendidikan){
       this.id_pendidikan =id_pendidikan;
   }

//mendapatkan id user    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id_user;

    //setter getter id
    public Integer getIdUser() {
        return id_user;
    }
    public void setIdUser(Integer id_user){
        this.id_user = id_user;
    }
//end atribut id user

//private nama_user
private String nama_user;

//setter getter
public String getNamaUser(){
    return nama_user;
}
public void setNamaUser(String nama_user){
    this.nama_user = nama_user;
}

//private alamat
private String alamat_user;

//setter getter
public String getAlamatUser(){
    return alamat_user;
}
public void setAlamatUser(String alamat_user){
    this.alamat_user = alamat_user;
}

//private atribut email 
private String email_user;
// setter getter
public String getEmailUser(){
    return email_user;
}
public void setEmailUser(String email_user){
    this.email_user=email_user;
}

//atribut telepon user
private Long telepon_user;
//setter getter
public Long getTeleponUser(){
    return telepon_user;
}
public void setTeleponUser(Long telepon_user){
    this.telepon_user=telepon_user;
}

//atribut user name
private String username;
//settergetter
public String getUserName(){
    return username;
}
public void setUserName(String username){
    this.username = username;
}

}