package exceptionHandling;

import java.io.*;

class Parent2 {
	void msg() throws ArithmeticException {
		System.out.println("parent method");
	}
}

public class TestExceptionChild2 extends Parent2 {
	//Scenario 1
	/*	If the superclass method declares an exception subclass overridden method can 
	 * declare the same subclass exception or no exception but cannot declare parent exception.*/	
	
	/*	void msg() throws Exception {
			System.out.println("child method");
		}*/
	
	//Scenario 2 this works .. or declare both Exception instead of ArithmeticException .. it also works
	void msg() throws ArithmeticException {
		System.out.println("child method");
	}

	public static void main(String args[]) {
		Parent2 p = new TestExceptionChild2();

		try {
			p.msg();
		} catch (Exception e) {
		}

	}
}