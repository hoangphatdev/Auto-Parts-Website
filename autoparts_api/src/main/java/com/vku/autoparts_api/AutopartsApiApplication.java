package com.vku.autoparts_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.vku.autoparts_api")
public class AutopartsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutopartsApiApplication.class, args);
	}

}
