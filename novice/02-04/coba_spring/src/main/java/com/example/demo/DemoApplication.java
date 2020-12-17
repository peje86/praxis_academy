package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;                 // import package controller
import org.springframework.web.bind.annotation.RequestMapping;    // import package reques mapping

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
