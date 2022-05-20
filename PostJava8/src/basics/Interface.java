package basics;

//types of interface
//normal interface
//functional interface - single abstract method 
//marker interface - no method

//Abstract class -> declare and define;
//Interface ->      declare also declare now after java8

interface Abc {
	void show();
	/*	if an interface declares default boolean equals() method It throws an error.. we have to define
	default boolean equals();
	 *  default boolean equals(){
			 return true;
		 }
		 default void hashcode() {
			 
		 }*/

}

class Impl implements Abc {
	public void show() {
		System.out.println("inside show in impl");
	}
}

public class Interface {

	public Interface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Abc obj = new Impl(); // creating obj of an interface
		obj.show();
	}
}
/*
public class JavaTester{
	   public static void main(String args[]){
	      int a; // declaration of variable
	      a=10; // definition of variable
	      functionA(a); // declaration of function
	   }
	   public static void functionA(int a){
	      System.out.println("value of a is " + a); // definition of function
	   }
	}*/