package org.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class jdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private courseJDBCRepo repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert();
    }
}
