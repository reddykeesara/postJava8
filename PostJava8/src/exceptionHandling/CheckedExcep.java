package exceptionHandling;


import java.io.*;

/*These are the exceptions that are checked at compile time. If some code within 
a method throws a checked exception, then the method must either handle the 
exception or it must specify the exception using the throws keyword. */

class CheckedExcep {

 // Main driver method
 public static void main(String[] args) throws IOException //if we dont have throws exception it shows compile time errors
 {

     // Reading file from path in local directory
     FileReader file = new FileReader("C:\\test\\a.txt");

     // Creating object as one of ways of taking input
     BufferedReader fileInput = new BufferedReader(file);

     // Printing first 3 lines of file "C:\test\a.txt"
     for (int counter = 0; counter < 3; counter++)
         System.out.println(fileInput.readLine());

     // Closing file connections
     // using close() method
     fileInput.close();
 }
}