package com.dreambig.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dreambig.model.A;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");  
		A a = context.getBean("a",A.class);  
		a.display();
	}
	    
}
