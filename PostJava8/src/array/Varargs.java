package array;


class Calc {
	// varargs used instead of add(int i), add(int i, int j)..
	public int add(int... n) { 

		int sum = 0;
		for (int i : n) {
			sum = sum + i;

		}
		System.out.println(sum);
		return sum;
	}
}

public class Varargs {

	public Varargs() {
		// TODO Auto-generated constructor stub
	}

	public final static void  main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc.add(1, 2, 3, 4, 5, 6, 7, 8, 9));
		calc.add(1,2);
		calc.add(1,2,3);
		calc.add(1,2,3,4);
		calc.add(1,2,3,4,5);
		calc.add(1,2,3,4,5,6);
		calc.add(1,2,3,4,5,6,7);
	}
}
 class MainMethodTest {

	public MainMethodTest() {
		System.out.println("no arg constructor");
	}

	public MainMethodTest(int s) {
		System.out.println("1 arg constructor " + s);
	}

	static {
		System.out.println("static block");
	}
	// var args...

	 public static final void main(String... args) {
		System.out.println("");
		MainMethodTest mmt = new MainMethodTest(1);
	}
	 public static void main() {
		 System.out.println("extra main");
	 }

}
