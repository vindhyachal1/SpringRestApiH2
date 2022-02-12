package com.restapi.us;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringRestApiH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiH2Application.class, args);
	}
	
	@RequestMapping(value= "/")
	public String test() {
		return "Home page, please type endpoint and select appropriate action to get proper response";
	}

}
