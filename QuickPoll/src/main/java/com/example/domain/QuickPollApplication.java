package com.example.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={JpaRepositoriesAutoConfiguration.class})
public class QuickPollApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickPollApplication.class, args);
	}
}
