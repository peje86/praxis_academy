package PengenKerjo.pengenkerjo.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
@Table(name="pendidikan")
public class Pendidikan{


  
//mendapatkan id_pendidikan otomatis
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer id_pendidikan;
//setter getter id
    public Integer getId() {
        return id_pendidikan;
    }
    public void setId(Integer id_pendidikan){
        this.id_pendidikan = id_pendidikan;
    }
// end atribut pendidikan++++++++++++++++++++



//variabel pendidikan
public String pendidikan;
//setter getter pendidikan

    public String getPendidikan() {
        return pendidikan;
    }
    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }
// end atribut pendidikan +++++++++++++++++++++++++++





}