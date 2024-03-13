package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            System.out.println("Hello World!");
            Truck t2 = (Truck) context.getBean("truck");
            t2.run();





    }
}
