package exceptionHandling;

public class ExceptionDemo {

}

class SuperC {
	void method()   {
		
	}
}

class ChildC extends SuperC{
	//we can throw checked exceptions like RuntimeException, Error in child class w/o parent
	//class thowing it
	
	//we cant user Exception/Throwable(not combatible with throws in parent class
	@Override
	void method() throws RuntimeException { //Error{
		
	}
}



class Super2C {
	void method()   throws Exception{
		
	}
}

class Child2C extends SuperC{
	
	@Override
	void method() {
		
	}
}