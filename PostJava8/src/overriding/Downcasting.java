package overriding;

//Parent class  
class Parent {   
  String name;   
  
  // A method which prints the data of the parent class   
  void showMessage()   
  {   
      System.out.println("Parent method is called");   
  }   
}   
  
//Child class   
class Child extends Parent {   
  int age;   
  
  // Performing overriding  
  @Override  
  void showMessage()   
  {   
      System.out.println("Child method is called");   
  }   
}   
  
public class Downcasting{  
  
  public static void main(String[] args)   
  {   
      Parent p = new Child();  
      p.name = "Shubham";  
        
      // Performing Downcasting Implicitly   
      //Child c = new Parent(); // it gives compile-time error   
        
      // Performing Downcasting Explicitly   
      Child c = (Child)p;   
  
      c.age = 18;   
      System.out.println(c.name);   
      System.out.println(c.age);   
      c.showMessage();   
  }   
}  

/*S.No	Upcasting	Downcasting
1.	A child object is typecasted to a parent object.		The reference of the parent class object is passed to the child class.
2.	We can perform Upcasting implicitly or explicitly.		Implicitly Downcasting is not possible.
3.	In the child class, we can access the methods and 		The methods and variables of both the classes
			variables of the parent class.                   (parent and child) can be accessed.
4.	We can access some specified methods of the child class.	All the methods and variables of both classes can be 
																	accessed by performing downcasting.
5.	Parent p = new Parent()										Parent p = new Child()
																Child c = (Child)p;*/