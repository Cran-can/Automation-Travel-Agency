package com.capgemini.ata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.capgemini.ata.repository")
@ComponentScan("com.capgemini.ata.*")
public class AutomationTravelAgencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomationTravelAgencyApplication.class, args);

	}

}
