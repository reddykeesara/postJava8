package immutable;

/*How to create Immutable class?
There are many immutable classes like String, Boolean, Byte, Short, Integer,
 Long, Float, Double etc. In short, all the wrapper classes and String 
 class is immutable. We can also create immutable class by creating 
 final class that have final data members as the example given below:

Example to create Immutable class
In this example, we have created a final class named Employee. 
It have one final datamember, a parameterized constructor and getter method.
*/ 

final class Employee {
	final String pancardNumber;

	public Employee(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
}
/*
 * The above class is immutable because:
 * 
 * The instance variable of the class is final i.e. we cannot change the value
 * of it after creating an object. The class is final so we cannot create the
 * subclass. There is no setter methods i.e. we have no option to change the
 * value of the instance variable. These points makes this class as immutable.
 * 
 */

public class ImmutableClass {
	public static void main(String ar[]) {
		Employee e = new Employee("ABC123");
		String s1 = e.getPancardNumber();
		System.out.println("Pancard Number: " + s1);
	}	
}