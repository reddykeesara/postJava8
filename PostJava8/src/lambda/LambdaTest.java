package lambda;

import java.awt.List;

/*
Java lambda expression is consisted of three components.

1) Argument-list: It can be empty or non-empty as well.
2) Arrow-token: It is used to link arguments-list and body of expression.
3) Body: It contains expressions and statements for lambda expression.*/

@FunctionalInterface
interface Cab {
	//Funct interf has only one abstract method
	public void bookCab();
	
	String toString();//eventhough not impl. it is still an FI bcos it is a method of Object class

	default void meth() {
		System.out.println("inside default meth of cab");
	}

	default void meth2() {
		System.out.println("inside default meth2 of cab");
	}
	
	static void statMeth() {
		System.out.println("inside static method of interface");
	}
}

class Uber implements Cab {

	@Override
	public void bookCab() {
		System.out.println("booked..");
		

	}
}
//
//}
class Xyz{
	static void statMeth() {
		System.out.println("static method in xyz class ");
	}
	public static void main(String[] args) {
		Thread th = new Thread(Xyz::statMeth);
		th.start();
	}
}

public class LambdaTest {

	public LambdaTest() {
		var myname = "";

//		  Cab cab = new Cab(); 
//		  cab.bookCab();

		// anonymous inner class

//		Cab cab = new Uber() {
//
//			@Override
//			public void bookCab() {
//				System.out.println(" booked");
//
//			}
//		};
//		cab.bookCab();

		// Lambda

		Cab cab2 = () -> {
			System.out.println("Lambda");
		};
		cab2.bookCab();

		Cab cab3 = () -> System.out.println("lambda shortcut ");
		
		cab3.bookCab();
		cab3.meth();
		Cab.statMeth();

		
//		Cab cab4 = (Source, dest) -> {
//			System.out.println("lambda ");
//			return 33.33;
//		};
//		double fare = cab4.bookCab("hyd", "wgl");
//		Cab.method();

	}

	public static void main(String[] args) {
		LambdaTest lt = new LambdaTest();

	}

}
