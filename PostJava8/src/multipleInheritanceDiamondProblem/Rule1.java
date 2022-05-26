package multipleInheritanceDiamondProblem;

//Rule 1 – Classes take higher precedence than interfaces – Any method inherited from a class 
//or a superclass is invoked over any default method inherited from an interface.

interface A {
	default void print() {
		System.out.println("inside print method of A ");
	}
}

interface B {
	default void print() {
		System.out.println("inside print method of B ");
	}
}

class C {
	public void print() { //remove public and try .. examine error
		System.out.println("inside print method of C ");
	}
}

public class Rule1 extends C implements A, B {



	public static void main(String[] args) {
		Rule1 rule1 = new Rule1();
		rule1.print();

	}
}
