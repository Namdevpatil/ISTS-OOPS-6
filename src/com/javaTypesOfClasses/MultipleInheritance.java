package com.javaTypesOfClasses;


//1. Multiple Inheritance is not possible with normal class
//public class MultipleInheritance extends Employee, Employee2

//2. Multiple Inheritance is not possible with abstract class
//public class MultipleInheritance extends Department, Department2

//3. Multiple Inheritance is possible with interface
public class MultipleInheritance implements Organization2, Organization
{

	@Override
	public String getDetails() 
	{
		return null;
	}

}
