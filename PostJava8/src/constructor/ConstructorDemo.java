package constructor;


/* A constructor in Java is a special method that is used to initialize objects	
A constructor in Java can not be abstract, final, static, or Synchronized. */

/*There are no “return value” statements in the constructor, but the constructor 
returns the current class instance. We can write ‘return’ inside a constructor. */

/*Rules of constructor chaining : 

The this() expression should always be the first line of the constructor.
There should be at-least be one constructor without the this() keyword
Constructor chaining can be achieved in any order. */

class P {
	public P() {

	}
	public P(int ab) {

	}

}

public class ConstructorDemo extends P {

	public ConstructorDemo() {
		// imlicitly super() is called here .. that means the constructor of P
		// super();
	}

//	public ConstructorDemo(int a) {
//		
//	}
	public static void main(String[] arg) {
		ConstructorDemo n = new ConstructorDemo();

	}
}