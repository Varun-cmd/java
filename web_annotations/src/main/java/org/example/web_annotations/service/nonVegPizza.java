package org.example.web_annotations.service;

import org.springframework.stereotype.Component;

@Component
public class nonVegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Non veg pizza returned!!";
    }
}
