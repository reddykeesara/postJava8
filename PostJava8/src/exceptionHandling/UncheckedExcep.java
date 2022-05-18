package exceptionHandling;


/*These are the exceptions that are not checked at compile time.  
so it is not forced by the compiler to either handle or specify the exception. 
It is up to the programmers to be civilized, and specify or catch the exceptions. 
In Java exceptions under Error and RuntimeException classes are unchecked exceptions, 
everything else under throwable is checked. 

Consider the following Java program. It compiles fine, but it throws ArithmeticException
when run. The compiler allows it to compile because ArithmeticException is an unchecked exception.*/

class UncheckedExcep {
	  
    // Main driver method
    public static void main(String args[])
    {
        // Here we are dividing by 0 which will not be caught at compile time
        // as there is no mistake but caught at runtime because it is mathematically incorrect
        int x = 0;
        int y = 10;
        int z = y / x;
    }
}