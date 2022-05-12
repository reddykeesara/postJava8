package overriding;

class P{
	public static void show() {
		System.out.println("in P ");
	}
}

class Q extends P{
	//@Override
	public static void show() {
		System.out.println("in Q ");
	}
}

public class OverridingStaticMethod {
	public static void main(String[] args) {
		P obj = new Q();
		obj.show();
	}
}
