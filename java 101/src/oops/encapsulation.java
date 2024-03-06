package oops;

import java.util.Scanner;

class car{
    public int wheels;
    public String brand;
    String color;
    private String spec;

    public car(){                       // default constructor
        wheels=0;
        brand =null;
        color= null;
        spec= null;

    }

    public car(int w,String b,String c){        // parameterized constructor
        this.wheels=w;
        this.brand=b;
        this.color=c;

    }

    public String getSpec()
    {
        return spec;
    }

    public void setBrand(String b){
        this.brand=b;

    }

    public void setwheels(int n){
        this.wheels=n;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        car c1 = new car();
        c1.color="red";
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter wheels:");
        n=in.nextInt();
        c1.setwheels(n);
        String brand;
        brand= in.nextLine();
        c1.setBrand(brand);


        car c2;         // creating reference variable  object created in heap memory
        c2=new car();   // object creation






    }

}
