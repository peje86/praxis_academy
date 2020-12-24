
// // 2. Role model

// // The Role class contains an id and a name field. The name field is an enum. We’ll have a fixed set of pre-defined roles. So it makes sense to make the role name as enum.

// // Here is the complete code for Role class -

// package jwt.test.polls.model;

// import org.hibernate.annotations.NaturalId;
// import javax.persistence.*;

// @Entity
// @Table(name = "roles")
// public class Role {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Enumerated(EnumType.STRING)
//     @NaturalId
//     @Column(length = 60)
//     private RoleName name;

//     public Role() {

//     }

//     public Role(RoleName name) {
//         this.name = name;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public RoleName getName() {
//         return name;
//     }

//     public void setName(RoleName name) {
//         this.name = name;
//     }
// }
