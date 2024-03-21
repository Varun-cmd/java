package org.example.web_annotations;

import org.example.web_annotations.controller.PizzaController;
import org.example.web_annotations.controller.myController;
import org.example.web_annotations.propertySource.propertyDemo;
import org.example.web_annotations.service.myService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WebAnnotationsApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(WebAnnotationsApplication.class, args);
        PizzaController p1 = context.getBean(PizzaController.class); // class name as args
        System.out.println(p1.getPizza());

        myController control = context.getBean(myController.class);
        System.out.println(control.hello());

        myService service = context.getBean(myService.class);
        System.out.println(service.hello());

        propertyDemo pty = context.getBean(propertyDemo.class);
        System.out.println(pty.getEmail());

    }

}
