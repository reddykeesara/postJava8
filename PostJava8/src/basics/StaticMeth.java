package basics;

public class StaticMeth {

	public static void meth() {
		System.out.println("inside meth of StaticClass");
	}
	public static void main(String[] args) {
		
	}
}

//We can call static methods in a class directly and also by instantiating
class anotherClass {
	public static void main(String[] args) {
		StaticMeth.meth();
		StaticMeth sc = new StaticMeth();
		sc.meth();
	}
}