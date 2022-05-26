package designPatterns;

 class MySingleton {
    // Static variable single_instance of type Singleton
    private static MySingleton single_instance = null;
  
    // Declaring a variable of type String
    public String s;
  
    // Constructor of this class
    // Here private constructor is used to
    // restricted to this class itself
    private MySingleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
  
    // Method
    // Static method to create instance of Singleton class
    public static MySingleton Singleton()
    {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new MySingleton();
        }
        return single_instance;
    }
}
  
class SingletonImpl {
    // Main driver method
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
        MySingleton x = MySingleton.Singleton();
  
        // Instantiating Singleton class with variable y
        MySingleton y = MySingleton.Singleton();
  
        // instantiating Singleton class with variable z
        MySingleton z = MySingleton.Singleton();
  
        // Now  changing variable of instance x
        // via toUpperCase() method
        x.s = (x.s).toUpperCase();
  
        // Print and display commands
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
  
        // Now again changing variable of instance x
        z.s = (z.s).toLowerCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}