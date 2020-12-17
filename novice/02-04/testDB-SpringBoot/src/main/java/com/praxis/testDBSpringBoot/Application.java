package com.praxis.testDBSpringBoot;

// import com.praxis.testDBSpringBoot.Test.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Application extends Test {

	public static void main(String[] args) {
		
		SpringApplication.run(Test.class, args);
	}

}
