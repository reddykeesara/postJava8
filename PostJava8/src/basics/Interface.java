package basics;

//types of interface
//normal interface
//single abstract method - functional interface - lambda expression
//marker interface - no method

//Abstract class -> define and declare
//Interface ->      declare also declare now after java8

interface Abc {
	void show();

}

class Impl implements Abc {
	public void show() {
		System.out.println("inside show in impl");
	}
}

public class Interface {

	public Interface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Abc obj = new Impl(); // creating obj of an interface
		obj.show();
	}
}
