package org.example.web_annotations.service;

import org.springframework.stereotype.Service;

@Service
public class myService {

    public String hello(){
        return "Hello from service";
    }
}
