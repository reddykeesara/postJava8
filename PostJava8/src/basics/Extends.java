package basics;

class A {

	public void show() {
		System.out.println("inside A show()");
	}
}

class B extends A {
	@Override
	public void show() {
		System.out.println("inside B show()");
	}

	public void display() {
		System.out.println("inside B display()");

	}
}

class C extends A {
	public void show() {
		System.out.println("inside C show()");
	}
}

public class Extends {

	public Extends() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		A obj1 = new B();//runtime polymorphism
		obj1.show();
		//obj1.display();
		
		obj1 = new C();
		obj1.show(); /// dynamic method dispatch
	}

}
