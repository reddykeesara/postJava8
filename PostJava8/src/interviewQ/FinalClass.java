package interviewQ;

/*The final modifier for finalizing the implementations of classes, methods, and variables.
The main purpose of using a class being declared as final is to prevent the class 
from being subclassed. If a class is marked as final then no class can inherit any feature 
from the final class.
You cannot extend a final class.*/
public final class FinalClass {
	
	public final void method() {
		System.out.println("method in final class");
	}

	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		fc.method();
	}
}
