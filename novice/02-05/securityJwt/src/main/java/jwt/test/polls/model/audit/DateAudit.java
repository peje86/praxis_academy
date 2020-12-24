// // 3. DateAudit model

// // All right! Let’s now define the DateAudit model. It will have a createdAt and an updatedAt field. Other domain models that need these auditing fields will simply extend this class.

// // We’ll use JPA’s AuditingEntityListener to automatically populate createdAt and updatedAt values when we persist an entity.

// // Here is the Complete DateAudit class (I’ve created a package named audit inside com.example.polls.model package to store all the auditing related models) -

// package jwt.test.polls.model.audit;

// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// import org.springframework.data.annotation.CreatedDate;
// import org.springframework.data.annotation.LastModifiedDate;
// import org.springframework.data.jpa.domain.support.AuditingEntityListener;
// import javax.persistence.Column;
// import javax.persistence.EntityListeners;
// import javax.persistence.MappedSuperclass;
// import java.io.Serializable;
// import java.time.Instant;

// @MappedSuperclass
// @EntityListeners(AuditingEntityListener.class)
// @JsonIgnoreProperties(
//         value = {"createdAt", "updatedAt"},
//         allowGetters = true
// )
// public abstract class DateAudit implements Serializable {

//     @CreatedDate
//     @Column(nullable = false, updatable = false)
//     private Instant createdAt;

//     @LastModifiedDate
//     @Column(nullable = false)
//     private Instant updatedAt;

//     public Instant getCreatedAt() {
//         return createdAt;
//     }

//     public void setCreatedAt(Instant createdAt) {
//         this.createdAt = createdAt;
//     }

//     public Instant getUpdatedAt() {
//         return updatedAt;
//     }

//     public void setUpdatedAt(Instant updatedAt) {
//         this.updatedAt = updatedAt;
//     }
// }
