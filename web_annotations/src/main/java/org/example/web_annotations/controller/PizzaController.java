package org.example.web_annotations.controller;


import org.example.web_annotations.service.Pizza;
import org.example.web_annotations.service.vegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component()
public class PizzaController {

    private Pizza p1;
    @Autowired
    public PizzaController(@Qualifier("nonVegPizza") Pizza p1) {
        this.p1 = p1;
    }
    //    @Autowired
//    public PizzaController(vegPizza p1) {
//        this.p1 = p1;
//    }

    public String getPizza(){
        return p1.getPizza();
    }

}
