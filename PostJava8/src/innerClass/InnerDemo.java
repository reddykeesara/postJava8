package innerClass;

public class InnerDemo {

	public InnerDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Outer outerObj = new Outer();
		outerObj.show();
		Outer.Inner inner = outerObj.new Inner();
		inner.display();
		
	}
}

class Outer{


	int a;
	public void show() {
		System.out.println("inside outer show() ");
	}
	
	class Inner{
		public void display(){
			System.out.println("inside inner display()");
		}
	}
}