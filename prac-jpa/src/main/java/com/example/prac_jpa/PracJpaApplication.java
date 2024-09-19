package com.example.prac_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages=
							{
								"com.example.model",
								"com.example.bootstrap",
								"com.example.repository"
								})
public class PracJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracJpaApplication.class, args);
	}

}
