package multipleInheritanceDiamondProblem;

/* Rule 3 In case Rule 1 and Rule 2 are not able to resolve the conflict then the 
implementing class has to specifically override and provide 
a method with the same method definition */

interface A3{
	default void print() {
		System.out.println("inside print method of A ");
	}
}
interface B3{
	default void print() {
		System.out.println("inside print method of B ");
	}
}

public class Rule3 implements A3,B3 {
	/*	public void print() {
			System.out.println("inside print method of Rule3 ");
			B3.super.print();
		}
		public void other() {
			A3.super.print();
		}*/
	
	public void print() {
		System.out.println("inside print method of Rule3 ");
	}
	public static void main(String[] args) {
		Rule3 rule3 = new Rule3();
		rule3.print();		
	}
}
