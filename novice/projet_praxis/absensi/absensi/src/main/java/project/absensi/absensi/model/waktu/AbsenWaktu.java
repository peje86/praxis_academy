// package contoh.jwt.contohJwt.model.audit;

// // import contoh.jwt.contohJwt.model.audit.DateAudit;
// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// import org.springframework.data.annotation.CreatedBy;
// import org.springframework.data.annotation.LastModifiedBy;

// import javax.persistence.Column;
// import javax.persistence.MappedSuperclass;

// @MappedSuperclass
// @JsonIgnoreProperties(
//         value = {"createdBy", "updatedBy"},
//         allowGetters = true
// )
// public abstract class AbsenWaktu extends Waktu {
//     @CreatedBy
//     @Column(updatable = false)
//     private Long createdBy;

//     @LastModifiedBy
//     private Long updatedBy;

//     public Long getCreatedBy() {
//         return createdBy;
//     }

//     public void setCreatedBy(Long createdBy) {
//         this.createdBy = createdBy;
//     }

//     public Long getUpdatedBy() {
//         return updatedBy;
//     }

//     public void setUpdatedBy(Long updatedBy) {
//         this.updatedBy = updatedBy;
//     }
// }
