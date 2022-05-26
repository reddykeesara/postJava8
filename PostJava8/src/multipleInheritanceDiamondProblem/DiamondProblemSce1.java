package multipleInheritanceDiamondProblem;


interface Alpha{
	default void print() {
		System.out.println("inside print of Alpha ");
	}
}

interface Beta extends Alpha{
	/*	default void print() {
			System.out.println("inside print of Beta ");
		}*/
}

interface Gama extends Alpha{
	/*	default void print() {
			System.out.println("inside print of Gama ");
		}*/
}


public class DiamondProblemSce1 implements Beta,Gama{

	public static void main(String[] args) {
		DiamondProblemSce1 dp = new DiamondProblemSce1();
		dp.print();
	}
}
