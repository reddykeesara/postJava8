package lambda;

import java.util.function.BiFunction;

//Java provides a new feature called method reference in Java 8. Method reference
//is used to refer method of functional interface. It is compact and easy form of 
//lambda expression. Each time when you are using lambda expression to just
//referring a method, you can replace your lambda expression with method reference.
//In this tutorial, we are explaining method reference concept in detail.
//
//Types of Method References
//There are following types of method references in java:
//
//Reference to a static method.
//Reference to an instance method.
//Reference to a constructor.

interface Calculator {
	void add(int a, int b);
	//void sub(int a, int b); adding this wont make :: work
}

class Calc {
	public static void doSome(int a, int b) {
		System.out.println(" added " + (a + b));
	}

	public void doAdd(int a, int b) {
		System.out.println(" added " + (a + b));
	}

}

interface Messenger {
	Message getMsg(String msg);
}

class Message {
	public Message(String msg) {
		System.out.println("inside Message Constructor ");
		System.out.println(msg);
	}
}

public class MethodReferenceLambda {

	public static void main(String[] args) {

		//Calc.doSome(11,12);

		//Reference to static method
		Calculator cref = Calc::doSome;
		cref.add(2, 3);

		// Reference to a non static method
		Calc calc = new Calc();
		Calculator cref2 = calc::doAdd;
		cref2.add(5, 6);

		// Reference to Constructor
		Messenger mRef = Message::new;
		mRef.getMsg("ref constructor");
		
	}
}
