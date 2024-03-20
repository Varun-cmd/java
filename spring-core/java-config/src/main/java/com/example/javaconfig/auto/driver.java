package com.example.javaconfig.auto;

import com.example.javaconfig.config.AppConfig;
import com.example.javaconfig.sample.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class driver {
    public static void main(String[] args) {
        ApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
        tesy t1 = context.getBean(tesy.class);
        t1.print();
        tesy t2 = context.getBean(tesy.class);
        tesy t3 = context.getBean(tesy.class);
        t2.print();
        t3.print();



    }
}
