package com.haulmont.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringjpaApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);
	}

}
