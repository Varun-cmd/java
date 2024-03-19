package com.example.javaconfig.trucks;

public class Wheels implements Vehicle {
    public int w;

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void run(){
        System.out.println("Wheels spinning");
    }
}
