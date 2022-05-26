package constructor;

public class InitBlock {

}


class Temp
{
    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }
 
    // no-arg constructor
    Temp()
    {
        System.out.println("default");
    }
 
    // constructor with one argument.
    Temp(int x)
    {
        System.out.println(x);
    }
 
    public static void main(String[] args)
    {
        // Object creation by calling no-argument
        // constructor.
        new Temp();
 
        // Object creation by calling parameterized
        // constructor with one parameter.
        new Temp(10);
    }
}




class Temp2
{
    // block to be executed first
    {
        System.out.println("init");
    }
    Temp2()
    {
        System.out.println("default");
    }
    Temp2(int x)
    {
        System.out.println(x);
    }
 
    // block to be executed after the first block which has been defined above.
    {
        System.out.println("second");
    }
    public static void main(String args[])
    {
        new Temp2();
        new Temp2(10);
    }
}