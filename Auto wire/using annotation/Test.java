package com.springcore.autoWire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autoWire/annotation/autoWireConfigAnnotation.xml");
	Emp emp1= context.getBean("emp",Emp.class);
	System.out.println(emp1);
	}

}

/* 
In auto wire by annotation method we use "@autowired" above the object or setter method or the constructor.
In xml configuration we have to specify the <context:annotation-config />
annotation config uses "byType" autowire.
 */
