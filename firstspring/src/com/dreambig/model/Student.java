package com.dreambig.model;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("Hello "+name+". your first spring app is running successfully..");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}
