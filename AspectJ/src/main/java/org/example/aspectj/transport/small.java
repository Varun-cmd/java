package org.example.aspectj.transport;

import org.springframework.stereotype.Component;

@Component
public class small implements  Truck{


    int Truck_id;

    public small() {
    }

    @Override
   public void run(){
        System.out.println("Small truck running");
    }

}
