package org.example.aspectj.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Driver {

    @Value("2088")
    public int D_id;

    @Autowired
    public Truck t1;

    public Driver() {
    }

    public Truck getT1() {
        return t1;
    }

    public void setT1(Truck t1) {
        this.t1 = t1;
    }

    public int getD_id() {
        return D_id;
    }

    public void setD_id(int d_id) {
        D_id = d_id;
    }


}
