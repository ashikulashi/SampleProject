package com.sample;

public class Employee {
	
	
	//To create a method
	private void employeeId() {
		System.out.println("Employee id is 75675");
	}
	
	//To create a another method
	private void employeeName() {
		System.out.println("Employee Name is Bhavani");

	}
	
	//To create a main method
	public static void main(String[] args) {
		
		//To create a object
		//ClassName objRef=new ClassName();
		Employee  e=new Employee();
		
		//To call a method
		//ObjRef.methodName();
		e.employeeId();
		e.employeeName();
		
		
		
	}

}
