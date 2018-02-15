package com.stackroute;

public class Member {
	
	String name;
	int age;
	double salary;
	
	public Member(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	public void display()
	{
		System.out.println("Member name: "+this.name);
		System.out.println("Member age: "+this.age);
		System.out.println("Member salary: "+this.salary);
	}

}
