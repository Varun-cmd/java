package org.example.web_annotations.controller;

import org.springframework.stereotype.Controller;

@Controller
public class myController {
    public String hello(){
        return("Hello humans from controller");
    }
}
