package overriding;

class A{
	public void show() {
		System.out.println("in A ");
	}
	
	public void showA() {
		System.out.println("in showA ");
	}
}

class B extends A{
	//@Override
	public void show() {
		//super.show();
		System.out.println("in B ");
	}
	public void showB() {
		System.out.println("in showB ");
	}
}

public class OverridingDemo {
	public static void main(String[] args) {
		//B obj = new B();
		A obj = new B();
		obj.show();
		
		B c = (B)obj;
	}
}
