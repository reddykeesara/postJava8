package constructor;

public class ConstructorThis {

}

//Java program to illustrate Constructor Chaining within same class Using this() keyword
class Temp3 {
	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	Temp3() {
		// calls constructor 2
		this(5);
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	Temp3(int x) {
		// calls constructor 3
		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	Temp3(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String args[]) {
		// invokes default constructor first
		new Temp3();
	}
}




//Java program to illustrate Constructor Chaining
//within same class Using this() keyword
//and changing order of constructors
class Temp4
{
 // default constructor 1
 Temp4()
 {
     System.out.println("default");
 }

 // parameterized constructor 2
 Temp4(int x)
 {
     // invokes default constructor
     this();
     System.out.println(x);
 }

 // parameterized constructor 3
 Temp4(int x, int y)
 {
     // invokes parameterized constructor 2
     this(5);
     System.out.println(x * y);
 }

 public static void main(String args[])
 {
     // invokes parameterized constructor 3
     new Temp4(8, 10);
 }
}



//Java program to illustrate Constructor Chaining to other class using super() keyword
class Base2
{
 String name;

 // constructor 1
 Base2()
 {
     this("");
     System.out.println("No-argument constructor of" +
                                        " base class");
 }

 // constructor 2
 Base2(String name)
 {
     this.name = name;
     System.out.println("Calling parameterized constructor"
                                           + " of base");
 }
}

class Derived2 extends Base2
{
 // constructor 3
 Derived2()
 {
     System.out.println("No-argument constructor " +
                        "of derived");
 }

 // parameterized constructor 4
 Derived2(String name)
 {
     // invokes base class constructor 2
     super(name);
     System.out.println("Calling parameterized " +
                        "constructor of derived");
 }

 public static void main(String args[])
 {
     // calls parameterized constructor 4
     Derived2 obj = new Derived2("test");

     // Calls No-argument constructor
     // Derived2 obj = new Derived2();
 }
}