package com.javaTypesOfClasses;


//interface 
public abstract interface Organization2 
{
	
	//-- fields(non-static and static)
	
	//-- non-static fileds
	//private int orgId;//Illegal modifier for the interface field Organization.orgId; only public, static & final are permitted
	
	//-- static fields
	//public static String countryName;//The blank final field countryName may not have been initialized
	
	//++ public static final fields:constants
	public static final int ORGANIZATION_ID = 3399;
	public static final String ORGANIZATION_NAME = "IBM";
	
	// no constructors:  Interfaces cannot have constructors
		
	// no blocks: The interface Organization cannot define an initializer
	
	//methods
	
	//no non-static methods
	
	//static methods
	public static String getOrganizationDetails()
	{
		return ORGANIZATION_ID+" | "+ORGANIZATION_NAME;
	}
	
	//++ abstract methods *
	public abstract String getDetails();
	
	
	//-- able to create an objects *
	//Organization organization = new Organization();//Cannot instantiate the type Organization

}
