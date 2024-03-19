package com.example.javaconfig.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class pc implements Computer {
    public void compile(){
        System.out.println("Compiling in PC");
    }
}
