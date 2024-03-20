package com.example.javaconfig.auto;

import com.example.javaconfig.sample.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class tesy {

    @Autowired
    public weather w1;

    @Lookup
    public weather getobj(){
        return null;
    }
    void print(){
        System.out.println(w1);
    }



}
