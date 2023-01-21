package com.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student s = (Student) context.getBean("student");     // same as id given in...xml file.....and type castiong
		
		System.out.println("Student Details = "+s);
		
//		System.out.println("Student Details = "+s.toString());
		
		

	}

}
