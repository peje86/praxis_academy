package oauth.loker.loker.model;

import org.hibernate.annotations.NaturalId;
import javax.persistence.*;  // * memanggil semua class dan anotasi dari JPA

//keterangan :
// javax persistense adalah class dan anotasi dari JPA yg berada dlm 1 paket


@Entity
@Table(name="roles")
public class Role {

    // memanggil class dan anotasi java 
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    // ATRIBUT ID
    private Long id;
 


// setter getter id
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id= id;
    }
// end setter getter


//memanggil anotasi dan class   
//  @Enumerated(EnumType.STRING) nilai enum kita tentukan sendiri
// contoh enum 

// package membuat string bernilai kosong, isi diambil dr kelas lain
// @Enumerated(EnumType.STRING)
// @NaturalId
// @Column(length = 60)

@Enumerated(EnumType.STRING)
@NaturalId
@Column(length = 60)
// attribut role
private RoleName name;

public Role() {
    // dikosongkoan 

}

public Role(RoleName name) {
    this.name = name;
}

// setter getter roleName
public RoleName getName() {
            return name;
        }
    
public void setName(RoleName name) {
            this.name = name;
        }


}

