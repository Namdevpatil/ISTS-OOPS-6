package com.javaTypesOfClasses;


public class TestClass {

	public static void main(String[] args) {
		
		
		TestAbstractClass abstractClass = new TestAbstractClass();
		System.out.println(abstractClass.getDetails());
		
		System.out.println("-----------------------------------------------");
		
		TestInterfaceClass interfaceClass = new TestInterfaceClass();
		System.out.println(interfaceClass.getDetails());

	}

}
