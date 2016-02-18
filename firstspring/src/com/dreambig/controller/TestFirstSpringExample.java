package com.dreambig.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.dreambig.model.Student;

public class TestFirstSpringExample {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("resources/applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Student student =  (Student)beanFactory.getBean("studentbean");
		student.display();
	}

}
