<<<<<<<<<<<<<<<<<<MEMBUAT LOGIN DENGAN MEMILIH ROLE DAN JWT DI SPRING  >>>>>>>

1. file pom.xml >> import depedensy

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
	<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.datatype</groupId>
			<artifactId>jackson-datatype-jsr310</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>javax.validation</groupId>
			<artifactId>validation-api</artifactId>
		</dependency>
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>
					<groupId>org.junit.vintage</groupId>
					<artifactId>junit-vintage-engine</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

2. file aplication.properties

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
# sumber :  https://grokonez.com/spring-framework/spring-boot/spring-security-jwt-authentication-postgresql-restapis-springboot-spring-mvc-spring-jpa

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update

spring.jpa.hibernate.show-sql=true

spring.datasource.url=jdbc:postgresql://localhost:5432/loginrolejwt_2?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false

spring.datasource.username=peje86

spring.datasource.password=peje1234

spring.datasource.initialization-mode=always

spring.datasource.initialize=true

spring.datasource.continue-on-error=true

spring.jackson.serialization.WRITE_DATES_AS_TIMESTAMPS= false
spring.jackson.time-zone= UTC

app.jwtSecret= JWTSuperSecretKey
app.jwtExpirationInMs = 604800000

server.port = 8085


# # App Properties
# grokonez.app.jwtSecret=jwtGrokonezSecretKey
# grokonez.app.jwtExpiration=86400

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


3. folder model 
	a. buat file User.java
	
	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	package praxis.loginrolejwt.loginRoleJwt.model;

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
 
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "username"
        }),
        @UniqueConstraint(columnNames = {
            "email"
        })
})
public class User{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @NotBlank
    @Size(min=3, max = 50)
    private String name;
 
    @NotBlank
    @Size(min=3, max = 50)
    private String username;
 
    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
 
    @NotBlank
    @Size(min=6, max = 100)
    private String password;
 
 // many to many
 
    // @ManyToMany(fetch = FetchType.LAZY)
    // @JoinTable(name = "user_roles", 
    //   joinColumns = @JoinColumn(name = "user_id"), 
    //   inverseJoinColumns = @JoinColumn(name = "role_id"))
    // private Set<Role> roles = new HashSet<>();
 
    public User() {}
 
    public User(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
 
 // file untuk setter getter many to many
 
    // public Set<Role> getRoles() {
    //     return roles;
    // }
 
    // public void setRoles(Set<Role> roles) {
    //     this.roles = roles;
    // }
}
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	3.	b.buat file role.java
	
	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	package praxis.loginrolejwt.loginRoleJwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.hibernate.annotations.NaturalId;
 
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
 
 	// untuk memanggil  class role name
 
    // @Enumerated(EnumType.STRING)
    // @NaturalId
    // @Column(length = 60)
    // private RoleName name;
 
    public Role() {}
 
    // public Role(RoleName name) {
    //     this.name = name;
    // }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
    
    // setter getter rolename.
 
    // public RoleName getName() {
    //     return name;
    // }
 
    // public void setName(RoleName name) {
    //     this.name = name;
    // }
}
	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	3.c. memenggil many to many user dan role serta memanggil class rolename
	
	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	// aktifkan //
			A.
	// many to many user.java
	
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles", 
      joinColumns = @JoinColumn(name = "user_id"), 
      inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
 
	
	
	// setter getter
	
	 public Set<Role> getRoles() {
        return roles;
    }
 
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
	
	
			B. role.java
			
			
    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;
 
  //  public Role() {}
 
    public Role(RoleName name) {
        this.name = name;
    }
			
			
			//setter getter role
			  public RoleName getName() {
        return name;
    }
 
    public void setName(RoleName name) {
        this.name = name;
    }
	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

4. RUNNING mvn spring-boot:run

5. liat perubahan database di terminal

loginrolejwt_2=# \dt
        List of relations
 Schema | Name  | Type  | Owner  
--------+-------+-------+--------
 public | users | table | peje86
(1 row)

loginrolejwt_2=# select * from users;
 id | email | name | password | username 
----+-------+------+----------+----------
(0 rows)

loginrolejwt_2=# \dt
        List of relations
 Schema | Name  | Type  | Owner  
--------+-------+-------+--------
 public | users | table | peje86
(1 row)

loginrolejwt_2=# \dt
        List of relations
 Schema | Name  | Type  | Owner  
--------+-------+-------+--------
 public | roles | table | peje86
 public | users | table | peje86
(2 rows)



>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
6. folder model
	buat file RoleName.java
	
	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	package praxis.loginrolejwt.loginRoleJwt.model;

public enum  RoleName {
    ROLE_USER,
    ROLE_PM,
    ROLE_ADMIN
}
	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.RUNNING SPRING>>
	
	BEFORE MENAMBAH ROLE NAME
	
	loginrolejwt_2=# \dt
        List of relations
 Schema | Name  | Type  | Owner  
--------+-------+-------+--------
 public | roles | table | peje86
 public | users | table | peje86
(2 rows)

loginrolejwt_2=# 


AFTER MENAMBAH ROLENAME.JAVA


loginrolejwt_2=# \dt
          List of relations
 Schema |    Name    | Type  | Owner  
--------+------------+-------+--------
 public | roles      | table | peje86
 public | user_roles | table | peje86
 public | users      | table | peje86
(3 rows)


