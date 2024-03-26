package org.example.jpa;

import JPA.jpaRepository;
import course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class jdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
//    private jpaRepository repository;
   private courseJDBCRepo repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(2,"GCP","GoogleCloud"));
        repository.insert(new Course(3,"GCP","GoogleCloud"));
        repository.insert(new Course(4,"GCP","GoogleCloud"));
        repository.deleteById(3);
    }
}
