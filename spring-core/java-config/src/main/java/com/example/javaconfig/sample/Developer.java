package com.example.javaconfig.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    @Autowired
//    @Qualifier("pc")
    private Computer c1;
    @Value("25")
    private int age;

    public Computer getC1() {
        return c1;
    }

    public void setC1(Computer c1) {
        this.c1 = c1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void compileCode() {
        c1.compile();
    }
}
