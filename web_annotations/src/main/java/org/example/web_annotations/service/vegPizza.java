package org.example.web_annotations.service;

import org.springframework.stereotype.Component;

@Component
public class vegPizza implements Pizza {


    public String getPizza(){
        return "Veg Pizza returned!";
    }

}
