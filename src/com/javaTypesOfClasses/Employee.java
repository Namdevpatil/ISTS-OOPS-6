package com.javaTypesOfClasses;

//General/Concrete/Regular class
public class Employee
{
	//fields(non-static and static)
	
	//non-static fields
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	
	//static fields
	public static String employeeDepartment;
	
	
	//constructors(default and parameterized)
	
	//default constructor
	public Employee() {
		
		
		
	}

	//parameterized constructor
	public Employee(int employeeId, String employeeName, String employeeRole) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
	}
	
		
	//blocks(static and instance initializer block): to initialize fields.
	
	//static
	static 
	{
		employeeDepartment = "Development";
	}
	
	//instance initializer block
	{
		employeeId = 202;
		employeeName = "Kiran";
		employeeRole = "Software Developer";
	}

	
	
	//methods(static and non-static): to print or write a logic/operation
	
	//non-static
	public String getEmployee() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeDepartment=" + employeeDepartment + "]";
	}
	
	//static 
	public static String getEmployeeDepartment() 
	{
		return "Employee [employeeDepartment=" + employeeDepartment + "]";
	}
	
	//inner classes(class within another class) or nested class	
	class A
	{
		//all the properties how we have for outer class.
	}
	
	//able to create an objects
	//Employee employee = new Employee();
	
}
