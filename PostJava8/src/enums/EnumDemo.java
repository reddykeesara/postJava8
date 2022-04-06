package enums;



/* enum in Java: Enumerations serve the purpose of representing a group of named constants in a programming language. 
For example, the 4 suits in a deck of playing cards may be 4 enumerators named Club, Diamond, Heart, 
and Spade, belonging to an enumerated type named Suit. Other examples include natural enumerated types
(like the planets, days of the week, colors, directions, etc.). 

Enums are used when we know all possible values at compile-time, such as choices on a menu, rounding modes, 
command-line flags, etc. It is not necessary that the set of constants in an enum type stay fixed for all time.

In Java (from 1.5), enums are represented using enum data type. Java enums are more powerful
than C/C++ enums. In Java, we can also add variables, methods, and constructors to it.
The main objective of enum is to define our own data types(Enumerated Data Types).

Declaration of enum in Java: Enum declaration can be done outside a Class or
inside a Class but not inside a Method.*/

//enum outside class
enum Color {
    RED,
    GREEN,
    BLUE;
    /* internally above enum Color is converted to
    class Color
    {
         public static final Color RED = new Color();
         public static final Color BLUE = new Color();
         public static final Color GREEN = new Color();
    }*/
	
	//Constructor// if void is put.. not working//public also not working
	private  Color() {
		System.out.println("Color Constructor ");
	}
}

public class EnumDemo {
	//enum inside class
	enum Day {
	    SUNDAY,
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY;
		
		//main method inside enum
		public static void main(String[] args) {
			System.out.println(Day.SUNDAY);
			Day day = Day.FRIDAY;
			day.method();
		}
		
		//Constructor// if void is put.. not working//public also not working
		private  Day() {
			System.out.println("inside enum constructor");
		}

		public void method() {
			System.out.println("inside enum day.. method()");
		}
		
	}
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        Day c2 = Day.SUNDAY;
        
        System.out.println(c1);
        System.out.println(c2);
                
        Day day = Day.FRIDAY;
		day.method();
		
		// Calling values()
        Color arr[] = Color.values();
 
        // enum with loop
        for (Color col : arr) {
            // Calling ordinal() to find index of color.
            System.out.println(col + " at index "   + col.ordinal());
        }
 
        // Using valueOf(). Returns an object of Color with given constant.
        // Uncommenting second line causes exception IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}
