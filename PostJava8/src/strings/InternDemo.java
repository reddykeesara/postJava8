package strings;

public class InternDemo {

	public static void main(String[] args) {
		String str = new String("Welcome to JavaTpoint");   
		String str1 = new String("Welcome to JavaTpoint");  
		System.out.println(str1 == str); // prints false  
		
		StringBuffer st = new StringBuffer("Welcome to JavaTpoint");   
		StringBuffer st1 = new StringBuffer("Welcome to JavaTpoint");  
		System.out.println(str1 == str); // prints false 
		
		String str2 = new String("Welcome to JavaTpoint").intern();   
		String str3 = new String("Welcome to JavaTpoint").intern();  
		System.out.println(str2 == str3); // prints true  
		
		/*
		 * We know that creating an object is a costly operation in Java. Therefore, to
		 * save time, Java developers came up with the concept of String Constant Pool
		 * (SCP). The SCP is an area inside the heap memory. It contains the unique
		 * strings. In order to put the strings in the string pool, one needs to call
		 * the intern() method. Before creating an object in the string pool, the JVM
		 * checks whether the string is already present in the pool or not. If the
		 * string is present, its reference is returned.
		 */		
		String s1 = new String("hello");
		String s2 = "hello";
		System.out.println(s1==s2);
	}
}
