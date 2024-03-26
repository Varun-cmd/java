package org.example.springjpa.repo;

import org.example.springjpa.entity.product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class productRepoTest {

    @Autowired
    private productRepo productRepo;

    @Test
    void saveMethod(){

        // product creation
        product p = new product();
        p.setPId(105);
        p.setStock(false);
        p.setProductName("Nintendo Gameboy");
        p.setPrice(15000);


        product saved = productRepo.save(p);
        System.out.println(saved);
    }

    @Test
    void updateUsingSaveMethod(){

            int id = 3;
            product p1 = productRepo.findById(id).get();

            p1.setStock(true);
            productRepo.save(p1);

    }

    void findByIdMethod(){

    }

    @Test
    void saveAllMethod(){
//        product p1 = new product(201,"RTX 4080ti",175000,true);
//        product p2 = new product(202,"RTX 3060",43000,false);
//        product p3 = new product(208,"Intel core i-9H",85500,true);

        product p1 = new product();
        p1.setPId(201);
        p1.setStock(true);
        p1.setProductName("Rtx 4080ti");
        p1.setPrice(155000);
        product p2 = new product();
        p2.setPId(202);
        p2.setStock(false);
        p2.setProductName("Rtx 3060");
        p2.setPrice(58000);
        product p3 = new product();
        p3.setPId(203);
        p3.setStock(true);
        p3.setProductName("Intel Core i-9U");
        p3.setPrice(125000);


        productRepo.saveAll(List.of(p1,p2,p3));
    }


}