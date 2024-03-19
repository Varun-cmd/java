package com.example.javaconfig.sample;

import com.example.javaconfig.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class company {
    public static void main(String[] args) {

        ApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
        Developer d1 = context.getBean(Developer.class);
        d1.getC1().compile();
        System.out.println(d1.getAge());




    }
}
