package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication(scanBasePackages = {"com"})
@EnableJms
public class Starter {
	
	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
		
	}

}
