package org.example.springjpa.repo;

import org.example.springjpa.entity.product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class productRepoTest {

    @Autowired
    private productRepo productRepo;

    @Test
    void saveMethod(){

        // product creation
        product p = new product();
        p.setPId(110);
        p.setStock(true);
        p.setProductName("Play Station 5");
        p.setPrice(45000);
        product p2 = new product();
        p2.setPId(111);
        p2.setStock(true);
        p2.setProductName("Nintendo Switch");
        p2.setPrice(24000);


        product saved = productRepo.save(p);
        product saved2 = productRepo.save(p2);
        System.out.println(saved);
    }


}