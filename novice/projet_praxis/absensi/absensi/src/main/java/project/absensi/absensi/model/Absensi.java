package project.absensi.absensi.model;

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

// import project.absensi.absensi.model.waktu.Waktu;
 

@Entity
@Table(name="absen")
public class Absensi  {
    
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

      // waktu datang

      @NotBlank
      @Size(min=3, max = 50)
      private Long datang;
   
      public Long getDatang(){
          return datang;
      }
      public void setDatang(Long datang){
          this.datang = datang;
      }

     // waktu pulang

     @NotBlank
     @Size(min=3, max = 50)
     private Long pulang;
  
     public Long getPulang(){
         return pulang;
     }
     public void setPulang(Long pulang){
         this.pulang = pulang;
     }

      // jamkerja

      @NotBlank
      @Size(min=3, max = 50)
      private Long jamkerja;
   
      public Long getJamkerja(){
          return jamkerja;
      }
      public void setJamkerja(Long jamkerja){
          this.jamkerja = jamkerja;
      }
      // lembur

    @NotBlank
    @Size(min=3, max = 50)
    private Long lembur;
 
    public Long getLembur(){
        return lembur;
    }
    public void setLembur(Long lembur){
        this.lembur = lembur;
    }
//tanggal

    private String tanggal;

    public String getTanggal(){
        return tanggal;
    }
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "record_absen", 
      joinColumns = @JoinColumn(name = "user_id"), 
      inverseJoinColumns = @JoinColumn(name = "absen_id"))
    private Set<User> users = new HashSet<>();
 
    // file untuk setter getter many to many
 
    public Set<User> getUsers() {
        return users;
    }
 
    public void setUsers(Set<User> users) {
        this.users = users;
    }


}