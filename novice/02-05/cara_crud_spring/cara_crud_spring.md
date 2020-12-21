1. install spring.io 
    depedency yang diperlukan:
    a. spring web
    b. Junit
    c. postgresql

2. setting application.properties 

# kode aplication sederhana 

# spring.datasource.url=jdbc:postgresql://localhost:5432/sekolahku
# spring.datasource.username=peje86
# spring.datasource.password=peje1234
# spring.jpa.hibernate.ddl-auto=update

# +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

# kode aplication properties lengkap....



spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect

spring.jpa.hibernate.ddl-auto=update

spring.jpa.hibernate.show-sql=true

spring.datasource.url=jdbc:postgresql://localhost:5432/sekolahku

spring.datasource.username=peje86

spring.datasource.password=peje1234


spring.datasource.initialization-mode=always

spring.datasource.initialize=true

spring.datasource.continue-on-error=true

# PENTIIIIIIIIIIIIIIIIING nama port harus beda atau tidak boleh sama....
server.port = 8081


++++++++++++++++++++++++++++++++++++++++++++++++



3. buatlah folder model , buat file class BioGuru.java  , file ini digunakan untuk membuat tabel di database  

++++++++++++++++++++end code++++++++++++++++++++++++++++++++++
package com.crud_spring.crudspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guru")
public class BioGuru {
    @Id private String nim;
    private String nama;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim(){
        return nim;
    }


}



++++++++++++++++++++++++++end source++++++++++++++=




4.buat folder controller, buat file MainController.java



+++++++++++++++++++++++++++++++++++++isi source code++++++++++++

package com.crud_spring.crudspring.controller;

import java.lang.reflect.Array;
import java.util.Optional;

import com.crud_spring.crudspring.model.BioGuru;
import com.crud_spring.crudspring.resource.MyResource;

import org.aspectj.weaver.ast.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//import antlr.collections.List;

@RestController
@RequestMapping(path="/") //kalau memanggil demo hanya memangil classnya saja
public class MainController {
    @Autowired
    private MyResource myResource;
    //get, post, get all, get id, post, update



@GetMapping (path="/guru") //memanggil method tampil data
public  java.util.List<BioGuru> get_All() {
    return myResource.findAll();
}
 

}


+++++++++++++++++++++++end code+++++++++++++++++++++++++++++++++


5. membuat folder resource , buat file MyResource.java fungsi file ini untuk memanggil DEPEDENSI JPA untuk digunakan di controller.

++++++++++++++++++++++source code++++++++++++++++

package com.crud_spring.crudspring.resource;

import com.crud_spring.crudspring.model.BioGuru;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyResource extends JpaRepository<BioGuru ,String> {  //mengambil data dari depedency

}

++++++++++++++++++++++end code+++++++++++++++++++++

6. DEPEDENCY YANG DIPERLUKAN


ISI FILE  

++++++++++++++++++++++++++++++++++++++++++++++++++

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.4.1</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.crud_spring</groupId>
	<artifactId>crud-spring</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>crud-spring</name>
	<description>Demo project for Spring Boot</description>

	<properties>
		<java.version>11</java.version>
	</properties>


	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
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
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>


+++++++++++++++++++++++++++++++++++++++++++++++++++++

7. merubah file controller menambah method post..

//2. post data ke tabel database

++++++++++++++++++++++++++++++++++

@GetMapping(path="/get_nim/{nim}")//tipe bio mahasiswaa
public Optional<BioGuru> nimBioGuru(@PathVariable String nim){
    return myResource.findById(nim);
}


+++++++++++++++++++++++++++++++++++++++++++++++++++++

perubahan di MainController  

++++++++++++++++++++++++++++++++++++++++++++++++++++
package com.crud_spring.crudspring.controller;

import java.lang.reflect.Array;
import java.util.Optional;

import com.crud_spring.crudspring.model.BioGuru;
import com.crud_spring.crudspring.resource.MyResource;

import org.aspectj.weaver.ast.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//import antlr.collections.List;

@RestController
@RequestMapping(path="/") //kalau memanggil demo hanya memangil classnya saja
public class MainController {
    @Autowired
    private MyResource myResource;
    //get, post, get all, get id, post, update


// 1.  memanggil semua data
@GetMapping (path="/guru") //memanggil method tampil data
public  java.util.List<BioGuru> get_All() {  //bio guru diambil dari tabel nama class di model
    return myResource.findAll();
}
 
//2. post data ke tabel database

@GetMapping(path="/get_nim/{nim}")//tipe bio mahasiswaa
public Optional<BioGuru> nimBioGuru(@PathVariable String nim){
    return myResource.findById(nim);
}


}

+++++++++++++++++++++++++++++++++++++++++++++++++++++


// delete isi tabel dan update data 

+++++++++++++++++++++++++++++++++++++++++++++++

//.3 menghapus isi data tabel byId

@DeleteMapping(path="/delete/{nim}")//tidak menampilkan apapun
void deleteBioGuru(@PathVariable String nim){
    myResource.deleteById(nim);
}

//4. merubah data pake PUT 

@PutMapping(path="/update/{nim}")//tipe biomahasisa
public BioGuru replaceBioGuru(@RequestBody BioGuru newbioGuru, @PathVariable String nim){
    return myResource.findById(nim)
    .map(bioGuru->{
        bioGuru.setNama(newbioGuru.getNama());
        bioGuru.setNim(newbioGuru.getNim());
        return myResource.save(bioGuru);
    }).orElseGet(()->{
        newbioGuru.setNim(nim);
        return myResource.save(newbioGuru);
    });
    
}

++++++++++++++++++++++++++++++++++++++++


perubahan di Maincontroller


+++++++++++++++++++++++++++++++++++++++++++++++++++code ++++++++

package com.crud_spring.crudspring.controller;

import java.lang.reflect.Array;
import java.util.Optional;

import com.crud_spring.crudspring.model.BioGuru;
import com.crud_spring.crudspring.resource.MyResource;

import org.aspectj.weaver.ast.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//import antlr.collections.List;

@RestController
@RequestMapping(path="/") //kalau memanggil demo hanya memangil classnya saja
public class MainController {
    @Autowired
    private MyResource myResource;
    //get, post, get all, get id, post, update


// 1.  memanggil semua data
@GetMapping (path="/guru") //memanggil method tampil data
public  java.util.List<BioGuru> get_All() {  //bio guru diambil dari tabel nama class di model
    return myResource.findAll();
}
 
//2. post data ke tabel database

@GetMapping(path="/guruById/{nim}")//tipe bio mahasiswaa
public Optional<BioGuru> nimBioGuru(@PathVariable String nim){
    return myResource.findById(nim);
}

//.3 menghapus isi data tabel byId

@DeleteMapping(path="/delete/{nim}")//tidak menampilkan apapun
void deleteBioGuru(@PathVariable String nim){
    myResource.deleteById(nim);
}

//4. merubah data pake PUT 

@PutMapping(path="/update/{nim}")//tipe biomahasisa
public BioGuru replaceBioGuru(@RequestBody BioGuru newbioGuru, @PathVariable String nim){
    return myResource.findById(nim)
    .map(bioGuru->{
        bioGuru.setNama(newbioGuru.getNama());
        bioGuru.setNim(newbioGuru.getNim());
        return myResource.save(bioGuru);
    }).orElseGet(()->{
        newbioGuru.setNim(nim);
        return myResource.save(newbioGuru);
    });
    
}

}


++++++++++++++++++++++++end code++++++++++++++++++

5. POST DATA ke Tabel 

++++++++++++++++++++++++++++++++++++++++++++++
//5. post data ke tabel guru

@PostMapping(path="/post")
public BioGuru addBioGuru(@RequestBody BioGuru bioGuru){
    return myResource.save(bioGuru);
}

++++++++++++++++++++++++++end code ++++++++++++++++++++



