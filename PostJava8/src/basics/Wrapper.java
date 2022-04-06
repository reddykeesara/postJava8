package basics;

public class Wrapper {

	public Wrapper() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int i=5;//primitive datatype
		Integer ii =  5;//new Integer(5);  //Boxing / wrapping
		
		i = ii.intValue(); //unboxing
		Integer value = i; //autoboxing
		int k = value; //autounboxing
		
		
		String str = "123";
		int j = Integer.parseInt(str);
	}
}
