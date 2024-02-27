package com.javaTypesOfClasses;

//abstract class
public abstract class Department2 
{
	//fields(non-static and static)
	
	//non-static fields
	private int departmentId;
	private String departmentName;
	
	//static fields
	public static String organizationName;
	
	//constructors(default and parameterized)
	
	//default constructor
	public Department2() {
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Department2(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
		
	//blocks(static and instance initializer block): to initialize fields.
	
	//static
	static
	{
		organizationName = "IBM";
	}
	
	//instance initializer block
	{
		departmentId = 2990;
		departmentName = "Development";
	}
	
	//methods(static and non-static): to print or write a logic/operation
	
	//non-static methods
	public String getDepartment()
	{
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", organizationName=" + organizationName + "]";
	}
	
	//static method
	public static String getOrganization()
	{
		return "Organization [OrganizationName=" + organizationName + "]";
	}
	
	//++ abstract methods *
	public abstract String getDetails();
	
	
	//inner classes(class within another class) or nested class
	public class B
	{
		
	}
	
	//-- not able to create an objects *
	//Department department = new Department();//Cannot instantiate the type Department
	
}
