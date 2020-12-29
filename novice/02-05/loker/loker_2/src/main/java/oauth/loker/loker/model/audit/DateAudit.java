package oauth.loker.loker.model.audit;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;



//import class dan anotasi

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdAt", "updatedAt"},
        allowGetters = true
) 


public abstract class DateAudit implements Serializable {
 
    //tentukan nilai dan aturan atribut
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Instant createdAt; // atribut

    @LastModifiedDate
    @Column(nullable = false)
    private Instant updatedAt; //atribut

    //setter getter Createat
    private Instant getCreatedAt(){
        return createdAt;
    }
    private void setCreatedAt(Instant createdAt){
        this.createdAt = createdAt;
    }
    //setter getter updateat
    private Instant getUpdatedAt(){
        return updatedAt;
    }
    private void setUpdatedAt(Instant updatedAt){
        this.updatedAt =updatedAt;
    }
}