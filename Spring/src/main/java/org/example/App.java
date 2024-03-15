package org.example;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) throws BeansException {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            System.out.println("Hello World!");
//            Truck t2 = (Truck) context.getBean("truck");
//            t2.start();
            Truck t = (Truck) context.getBean("truck");
//            Truck t1 = context.getBean(Truck.class);
            t.start();



    }
}
