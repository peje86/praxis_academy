package project.absensi.absensi.model.waktu;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"jam"},
        allowGetters = true
)
public abstract class Waktu implements Serializable {
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Instant jamdatang;

    public Instant getJamdatang() {
        return jamdatang;
    }

    public void setJamdatang(Instant jamdatang) {
        this.jamdatang = jamdatang;
    }

    //////////

    // @LastModifiedDate
    // @Column(nullable = false)
    // private Instant updatedAt;

    

    // public Instant getUpdatedAt() {
    //     return updatedAt;
    // }

    // public void setUpdatedAt(Instant updatedAt) {
    //     this.updatedAt = updatedAt;
    // }
}
