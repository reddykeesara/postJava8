package constructor;

public class CopyConstructor {

}

//Java Program to Illustrate Copy Constructor

//Class 1
class Complex {

	// Class data members
	private double re, im;

	// Constructor 1
	// Parameterized constructor
	public Complex(double re, double im) {

		// this keyword refers to current instane itself
		this.re = re;
		this.im = im;
	}

	// Constructor 2
	// Copy constructor
	Complex(Complex c) {

		System.out.println("Copy constructor called");

		re = c.re;
		im = c.im;
	}

	// Overriding the toString() of Object class
	@Override
	public String toString() {

		return "(" + re + " + " + im + "i)";
	}
}

//Class 2
//Main class
class Main {

	// Main driver method
	public static void main(String[] args) {

		// Creating object of above class
		Complex c1 = new Complex(10, 15);

		// Following involves a copy constructor call
		Complex c2 = new Complex(c1);

		// Note: Following doesn't involve a copy
		// constructor call
		// as non-primitive variables are just references.
		Complex c3 = c2;

		// toString() of c2 is called here
		System.out.println(c2);
	}
}




//Java Program to Illustrate Copy Constructor

//Class 1
class Complex2 {

 // Class data members
 private double re, im;

 // Constructor
 public Complex2(double re, double im)
 {
     // this keyword refers to current instance itself
     this.re = re;
     this.im = im;
 }
}

//Class 2
//Main class
class CopyConstructorEx2 {

 // Main driver method
 public static void main(String[] args)
 {

     // Creating object of above class
     // inside main() method
     Complex2 c1 = new Complex2(10, 15);

     // Note: compiler error here
   //  Complex2 c2 = new Complex2(c1);
 }
}