package generics;

import java.util.ArrayList;

//Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter 
//to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity 
//such as class, interface, or method that operates on a parameterized type is a generic entity.

//from java 1.5
public class GenericsDemo {

//	Type Parameters in Java Generics
//	The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:
//
//	T – Type
//	E – Element
//	K – Key
//	N – Number
//	V – Value

	public static void main(String[] args) {

		// Test<int> obj = new Test<int>(20); //not allowed

		// even though primitive int array is allowed
		ArrayList<int[]> a = new ArrayList<>();

	}

}

class Test1 {
	// A Generic method example
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}

	// Driver method
	public static void main(String[] args) {
		// Calling generic method with Integer argument
		genericDisplay(11);

		// Calling generic method with String argument
		genericDisplay("GeeksForGeeks");

		// Calling generic method with double argument
		genericDisplay(1.0);
	}
}

//Java program to show working
//of user-defined Generic classes

//We use < > to specify Parameter type
class Test2<T> {
	// An object of type T is declared
	T obj;

	Test2(T obj) {
		this.obj = obj;
	} // constructor

	public T getObject() {
		return this.obj;
	}
}

//Driver class to test above
class Main1 {
	public static void main(String[] args) {
		// instance of Integer type
		Test2<Integer> iObj = new Test2<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test2<String> sObj = new Test2<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		// iObj = sObj; // This results an error
	}
}

class Test3<T, U> {
	T obj1; // An object of type T
	U obj2; // An object of type U

	// constructor
	Test3(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

// Driver class to test above
class Main2 {
	public static void main(String[] args) {
		Test3<String, Integer> obj = new Test3<String, Integer>("GfG", 15);

		obj.print();
	}
}

//Why Generics?
//The Object is the superclass of all other classes, and Object reference can refer to any object. 
//These features lack type safety. Generics add that type of safety feature.
// We will discuss that type of safety feature in later examples.
//
//Generics in Java are similar to templates in C++. For example, classes like 
//HashSet, ArrayList, HashMap, etc., use generics very well. 
//There are some fundamental differences between the two approaches to generic types. 
//
//Types of Java Generics
//Generic Method: Generic Java method takes a parameter and returns some value after performing a task.
// It is exactly like a normal function, however, a generic method has type parameters that 
// are cited by actual type. This allows the generic method to be used in a more general way.
// The compiler takes care of the type of safety which enables programmers to code 
// easily since they do not have to perform long, individual type castings.
//
//Generic Classes: A generic class is implemented exactly like a non-generic class.
// The only difference is that it contains a type parameter section. 
// There can be more than one type of parameter, separated by a comma. 
// The classes, which accept one or more parameters,are known as
// parameterized classes or parameterized types.
//
//Generic Class 
//Like C++, we use <> to specify parameter types in generic class creation. 
//To create objects of a generic class, we use the following syntax. 
//
//// To create an instance of generic class 
//BaseType <Type> obj = new BaseType <Type>()
//Note: In Parameter type we can not use primitives like ‘int’,’char’ or ‘double’.

// Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type
class Test4<T> {
	// An object of type T is declared
	T obj;

	Test4(T obj) {
		this.obj = obj;
	} // constructor

	public T getObject() {
		return this.obj;
	}
}

// Driver class to test above
class Main22 {
	public static void main(String[] args) {
		// instance of Integer type
		Test4<Integer> iObj = new Test4<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test4<String> sObj = new Test4<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
	}
}
//Output
//15
//GeeksForGeeks
//We can also pass multiple Type parameters in Generic classes. 

// Java program to show multiple
// type parameters in Java Generics

// We use < > to specify Parameter type
class Testb<T, U> {
	T obj1; // An object of type T
	U obj2; // An object of type U

	// constructor
	Testb(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

// Driver class to test above
class Main44 {
	public static void main(String[] args) {
		Testb<String, Integer> obj = new Testb<String, Integer>("GfG", 15);

		obj.print();
	}
}
//Output
//GfG
//15


//Generic Functions: 
//We can also write generic functions that can be called with different types of arguments 
//based on the type of arguments passed to the generic method. The compiler handles each method.

// Java program to show working of user defined Generic functions

class Testa {
	// A Generic method example
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}

	// Driver method
	public static void main(String[] args) {
		// Calling generic method with Integer argument
		genericDisplay(11);

		// Calling generic method with String argument
		genericDisplay("GeeksForGeeks");

		// Calling generic method with double argument
		genericDisplay(1.0);
	}
}
//Output
//java.lang.Integer = 11
//java.lang.String = GeeksForGeeks
//java.lang.Double = 1.0


//Generics Work Only with Reference Types: 
//When we declare an instance of a generic type, the type argument passed to the type
// parameter must be a reference type. We cannot use primitive data types like int, char.
//
//Test<int> obj = new Test<int>(20); 
//The above line results in a compile-time error that can be resolved using type 
//wrappers to encapsulate a primitive type. 
//
//But primitive type arrays can be passed to the type parameter because arrays are reference types.
//
//ArrayList<int[]> a = new ArrayList<>();
//Generic Types Differ Based on Their Type Arguments: 
//Consider the following Java code.

// Java program to show working
// of user-defined Generic classes

// We use < > to specify Parameter type
class Teste<T> {
	// An object of type T is declared
	T obj;

	Teste(T obj) {
		this.obj = obj;
	} // constructor

	public T getObject() {
		return this.obj;
	}
}

// Driver class to test above
class Main55 {
	public static void main(String[] args) {
		// instance of Integer type
		Teste<Integer> iObj = new Teste<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Teste<String> sObj = new Teste<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		// iObj = sObj; // This results an error
	}
}
//Output: 
//
//error:
// incompatible types:
// Test cannot be converted to Test 
//Even though iObj and sObj are of type Test, they are the references to different 
//types because their type parameters differ. Generics add type safety through this and prevent errors.
//
//Type Parameters in Java Generics
//The type parameters naming conventions are important to learn generics thoroughly.
// The common type parameters are as follows:
//
//T – Type
//E – Element
//K – Key
//N – Number
//V – Value
//Advantages of Generics: 
//Programs that use Generics has got many benefits over non-generic code. 
//
//1. Code Reuse: We can write a method/class/interface once and use it for any type we want.
//
//2. Type Safety: Generics make errors to appear compile time than at run time 
//(It’s always better to know problems in your code at compile time rather than 
//making your code fail at run time). Suppose you want to create an ArrayList that
// store name of students, and if by mistake the programmer adds an integer object
// instead of a string, the compiler allows it. But, when we retrieve 
// this data from ArrayList, it causes problems at runtime.

// Java program to demonstrate that NOT using
// generics can cause run time exceptions

class Tests {
	public static void main(String[] args) {
		// Creatinga an ArrayList without any type specified
		ArrayList al = new ArrayList();

		al.add("Sachin");
		al.add("Rahul");
		al.add(10); // Compiler allows this

		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);

		// Causes Runtime Exception
		String s3 = (String) al.get(2);
	}
}
//Output :
//
//Exception in thread "main" java.lang.ClassCastException: 
//   java.lang.Integer cannot be cast to java.lang.String
//    at Test.main(Test.java:19)
//How do Generics Solve this Problem? 
//When defining ArrayList, we can specify that this list can take only String objects.

// Using Java Generics converts run time exceptions into 
// compile time exception.

class Testt {
	public static void main(String[] args) {
		// Creating a an ArrayList with String specified
		ArrayList<String> al = new ArrayList<String>();

		al.add("Sachin");
		al.add("Rahul");

		// Now Compiler doesn't allow this
		// al.add(10);

		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);
		String s3 = (String) al.get(2);
	}
}
//Output: 
//
//15: error: no suitable method found for add(int)
//        al.add(10); 
//          ^
//3. Individual Type Casting is not needed: If we do not use generics, then, 
//in the above example, every time we retrieve data from ArrayList, we have to typecast it.
// Typecasting at every retrieval operation is a big headache. If we already know 
// that our list only holds string data, we need not typecast it every time.

// We don't need to typecast individual members of ArrayList

class Test21 {
	public static void main(String[] args) {
		// Creating a an ArrayList with String specified
		ArrayList<String> al = new ArrayList<String>();

		al.add("Sachin");
		al.add("Rahul");

		// Typecasting is not needed
		String s1 = al.get(0);
		String s2 = al.get(1);
	}
}

//  4. Generics Promotes Code Reusability: With the help of generics in Java, we
//  can write code that will work with different types of data. For example,
//  
//  public <T> void genericsMethod (T data) {...} Here, we have created a
//  generics method. This same method can be used to perform operations on
//  integer data, string data, and so on.
//  
//  5. Implementing Generic Algorithms: By using generics, we can implement
//  algorithms that work on different types of objects, and at the same, they are
//  type-safe too.
//  
//  This article is contributed by Dharmesh Singh. If you like GeeksforGeeks and
//  would like to contribute, you can also write an article and mail your article
//  to review-team@geeksforgeeks.org. See your article appearing on the
//  GeeksforGeeks main page and help other Geeks. Please write comments if you
//  find anything incorrect, or you want to share more information about the
//  topic discussed above.
 