package org.example.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repo.userRepo;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);

		@Autowired
		userRepo userRepo;





			product saved = productRepo.save(p);
			System.out.println();

	}

}
