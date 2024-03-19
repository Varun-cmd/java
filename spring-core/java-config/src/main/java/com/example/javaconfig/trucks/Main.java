package com.example.javaconfig.trucks;

import com.example.javaconfig.config.AppConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("hello world");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Engine e1 = context.getBean("engine",Engine.class);
		Wheels w1 = context.getBean("wheels",Wheels.class);
		smallTruck t1= context.getBean("truck",smallTruck.class);
		System.out.println("Enter engine type:");
		String  s = in.nextLine();
		t1.setE1(s);
		System.out.println("Enter No. of wheels:");
		int n = in.nextInt();
		t1.setW1(n);
		System.out.println(t1.getE1()+t1.getW1());


	}

}
