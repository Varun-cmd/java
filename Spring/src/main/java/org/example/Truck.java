package org.example;

public class Truck {
    private int wheels;
    private Component e1;

    public Truck() {
    }

    public void setE1(Component e1) {
        this.e1 = e1;
    }

    public Truck(int wheels) {
        System.out.println("Constructor called");
        this.wheels = wheels;
    }

    public Truck(int wheels, Component e1) {
        System.out.println("Para constructor called");
        this.wheels = wheels;
        this.e1 = e1;
    }




    void start(){
        System.out.println("Truck is running"+this.wheels);
        e1.run();
    }

    public void setWheels(int wheels) {
        System.out.println("Setter called ");
        this.wheels = wheels;
    }

}
