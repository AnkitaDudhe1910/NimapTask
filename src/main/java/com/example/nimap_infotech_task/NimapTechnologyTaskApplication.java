package com.example.nimap_infotech_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class NimapTechnologyTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(NimapTechnologyTaskApplication.class, args);
	}

}
