package com.Aseem.JavaStarter;

import java.io.Serializable;

public class Person implements Serializable{

	String firstName;
	String lastName;
	int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void writeName()
	{
		System.out.println("First Name is: "+firstName);
		System.out.println("Last Name is: "+lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
