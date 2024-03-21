package org.example.aspectj.transport;

import org.example.aspectj.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AspectJApplication {

    public static void main(String[] args) {

        ApplicationContext context  =new AnnotationConfigApplicationContext(AppConfig.class);
        Driver d1  = context.getBean(Driver.class);
        d1.t1.run();



    }

}
