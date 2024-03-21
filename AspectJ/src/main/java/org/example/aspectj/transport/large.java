package org.example.aspectj.transport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class large implements Truck{
    int Truck_id;

    public int getTruck_id() {
        return Truck_id;
    }

    public void setTruck_id(int truck_id) {
        Truck_id = truck_id;
    }

    @Override
    public void run() {
        System.out.println("Large Truck running");
    }
}
