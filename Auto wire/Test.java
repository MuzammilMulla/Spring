package com.springcore.autoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autoWire/autoWireConfig.xml");
	Emp sagar= context.getBean("emp",Emp.class);
	System.out.println(sagar);
	}

}

/* 
In auto wire by xml ,,,,
Auto wire does not support to primitive data types and String class.
in byName auto wiring -->  child class object name should match to the bean of the parent class
in byName auto wiring -->  above condition can be false 
 
 */
