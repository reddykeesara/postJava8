package multipleInheritanceDiamondProblem;


interface Alpha2{
	default void print() {
		System.out.println("inside print of Alpha ");
	}
}

interface Beta2 extends Alpha2{
		default void print() {
			System.out.println("inside print of Beta ");
		}
}

interface Gama2 extends Alpha2{
		default void print() {
			System.out.println("inside print of Gama ");
			Alpha2.super.print();
		}
}


public class DiamondProblemSce2 implements Beta2,Gama2{

	public void print() {
		System.out.println("inside print of Diamond ");
		Gama2.super.print();
		System.out.println("inside print of Diamond.. ");
		Beta2.super.print();
	}

	public static void main(String[] args) {
		DiamondProblemSce2 dp = new DiamondProblemSce2();
		dp.print();
	}
}
