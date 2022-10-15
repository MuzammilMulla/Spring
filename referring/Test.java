package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractRefreshableConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		 A a1= (A) context.getBean("aref");  //bean name should be passed inside the .getBean() method
		 System.out.println(a1.getX());   //using getters we can access the values
		 System.out.println(a1.getOb().getY());
		 System.out.println(a1);
	}

}
