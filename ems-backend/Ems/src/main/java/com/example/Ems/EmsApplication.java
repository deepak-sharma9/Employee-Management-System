package com.example.Ems;

import com.example.Ems.entity.Employee;
import com.example.Ems.repository.EmployeeRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
			EmployeeRepository repository

	) {
		return args -> {
			for (int i = 0; i < 50; i++) {
				Faker faker = new Faker();
				var author = Employee.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.email(faker.internet().emailAddress())
						.build();
				repository.save(author);
			}
		};
	}

}
