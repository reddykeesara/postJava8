package exceptionHandling;

import java.io.*;

class Parent {

	// defining the method
	void msg() {
		System.out.println("parent method");
	}
}

public class TestExceptionChild extends Parent {

	// overriding the method in child class

	/*  Scenario 1 .. If the superclass method does not declare an exception 
	  child overridden method can't throw checked exception
	
	  // gives compile time error  
	  	void msg() { throws IOException {     
		System.out.println("TestExceptionChild");    
	  }  */

	/*	Scenario 2
		 If the superclass method does not declare an exception 
		child overridden method can throw a unchecked exception*/
	void msg() throws ArithmeticException {
		System.out.println("child method");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}