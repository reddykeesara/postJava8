package multipleInheritanceDiamondProblem;

/*Rule 2 – Derived interfaces or sub-interfaces take higher precedence than the interfaces 
 * higher-up in the inheritance hierarchy
*/
interface A2{
	default void print() {
		System.out.println("inside print method of A ");
	}
}
interface B2 extends A2{
	default void print() {
		System.out.println("inside print method of B ");
	}
}

public class Rule2 implements B2{

	public static void main(String[] args) {
		Rule2 rule2 = new Rule2();
		rule2.print();
	}
}
