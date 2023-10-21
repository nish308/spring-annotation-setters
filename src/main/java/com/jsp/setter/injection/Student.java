package com.jsp.setter.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	private String name;
	private String email;
	
	@Value(value = "1")
	public void setId(int id) {
		this.id = id;
	}
	
	@Value(value = "Shubham")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value(value = "sh@mail.com")
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Student() {
		System.out.println("Object created...");
	}
	
	public void printStudent() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}
}
