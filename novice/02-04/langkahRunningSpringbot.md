1. setelah unzip file demo yang telah didownload dari spring.io

2. masuk ke main/java/demo/resources/aplications.properties/

isikan kode berikut di file application.properties

# spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect

# spring.jpa.hibernate.ddl-auto=update

# spring.jpa.hibernate.show-sql=true

# spring.datasource.url=jdbc:postgresql://localhost:5432/ pengen_kerjo

# spring.datasource.username=peje86 //username DB

# spring.datasource.password=peje1234 //password DB

# spring.datasource.initialization-mode=always

# spring.datasource.initialize=true

# spring.datasource.continue-on-error=true

# server.port = 8081


3. buka terminal di visual code instal maven
    - perintah :
    - sudo apt install maven
    
4. Running spring serta download depedency
    - perintah di terminal visual code:
    - mvn spring-boot:run 
    - tampilan sukses :


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.1)

2020-12-17 09:35:53.366  INFO 10975 --- [           main] com.example.demo.DemoApplication         : Starting DemoApplication using Java 11.0.9.1 on pujiono with PID 10975 (/home/pujiono/Documents/praxis_academy/novice/02-03/demo/target/classes started by pujiono in /home/pujiono/Documents/praxis_academy/novice/02-03/demo)
2020-12-17 09:35:53.370  INFO 10975 --- [           main] com.example.demo.DemoApplication         : No active profile set, falling back to default profiles: default
2020-12-17 09:35:54.598  INFO 10975 --- [           main] com.example.demo.DemoApplication         : Started DemoApplication in 2.262 seconds (JVM running for 3.14)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.857 s
[INFO] Finished at: 2020-12-17T09:35:54+07:00
[INFO] ------------------------------------------------------------------------
pujiono@pujiono:~/Documents/praxis_academy/novice/02-03/demo
$ 

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


5. merubah file main untuk menampilkan data 

Sekarang, coba buat sebuah controller dengan nama HelloController.java.

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;                 // import package controller        (tambahan)
import org.springframework.web.bind.annotation.RequestMapping;    // import package reques mapping     (tambahan)

@SpringBootApplication
@Controller                   // memanggil controller 
public class DemoApplication {

	@RequestMapping("/hello") //memanggil request mapping  

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	
		}


		public String hello() {    // menambah atribut hello
			return "hello";
	}

}


6. Sekarang kita harus membuat konfigurasi ViewResolver, biar controller bisa membaca letak file html kita. Buat file dengan nama MvcConfiguration.java di package config.