package com.example.javaconfig.config;
import com.example.javaconfig.sample.Computer;
import com.example.javaconfig.sample.Developer;
import com.example.javaconfig.sample.pc;

import com.example.javaconfig.sample.Laptop;
import com.example.javaconfig.trucks.Engine;
import com.example.javaconfig.trucks.Wheels;
import com.example.javaconfig.trucks.smallTruck;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.security.PublicKey;

@Configuration
@ComponentScan("com.example.javaconfig")
public class AppConfig {

//    @Bean
//    @Scope("prototype")
//    public Engine engine(){
//        System.out.println("Engine created!!");
//        return new Engine();
//    }
//
//    @Bean
//    @Scope("prototype")
//    public Wheels wheels(){
////        System.out.println("Wheels created");
//        return new Wheels();
//    }
//
//    @Bean
//    public smallTruck truck(){
////        System.out.println("Truck created");
//        return new smallTruck();
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }
//
//    @Bean
//    public pc PC(){
//        return new pc();
//    }
//
//    @Bean
//    Developer dev(@Qualifier("PC") Computer c1){
//        Developer obj = new Developer();
//        obj.setC1(c1);
//        return obj;
//
//    }




}
