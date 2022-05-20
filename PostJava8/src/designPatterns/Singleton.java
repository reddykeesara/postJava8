package designPatterns;

//singleton design pattern using lazy instantiation
class Singleton {
	private static Singleton obj;

	private Singleton() {
	}

	public static Singleton getSingleton() {
		if (obj == null) {
			synchronized (Singleton.class) {
				if (obj == null) {
					obj = new Singleton();// instance will be created at request time
				}
			}
		}
		return obj;
	}

	public void doSomething() {
		// write your code
	}
}

//eager singleton

class A{  
	 private static A obj=new A();//Early, instance will be created at load time  
	 private A(){}  
	   
	 public static A getA(){  
	  return obj;  
	 }  
	  
	 public void doSomething(){  
	 //write your code  
	 }  
}  

/*Significance of Serialization in Singleton Pattern
If singleton class is Serializable, you can serialize the singleton instance. Once it is serialized, 
you can deserialize it but it will not return the singleton object.

To resolve this issue, you need to override the readResolve() method that enforces the singleton.
 It is called just after the object is deserialized. It returns the singleton object*/