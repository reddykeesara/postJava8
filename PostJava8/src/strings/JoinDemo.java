package strings;

import java.util.Objects;
import java.util.StringJoiner;

public class JoinDemo {

	/*
	 * The Java String class join() method returns a string joined with a given
	 * delimiter. In the String join() method, the delimiter is copied for each
	 * element. The join() method is included in the Java string since JDK 1.8.
	 * 
	 * There are two types of join() methods in the Java String class
	 */
//internal implementation of String class
	public static String join(CharSequence delimiter, CharSequence... elements) {
		Objects.requireNonNull(elements);
		Objects.requireNonNull(delimiter);

		StringJoiner jnr = new StringJoiner(delimiter);
		for (CharSequence c : elements) {
			jnr.add(c);
		}
		return jnr.toString();
	}
	
//internal implementation of String class
	public static String join2(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
		Objects.requireNonNull(elements);
		Objects.requireNonNull(delimiter);

		StringJoiner jnr = new StringJoiner(delimiter);
		for (CharSequence c : elements) {
			jnr.add(c);
		}
		return jnr.toString();
	}

	public static void main(String args[]) {
		String joinString1 = String.join("-", "welcome", "to", "javatpoint");
		String joinStr = join("-", "welcome", "to", "javatpoint");
	//	String joinStr2 = join2("-", "welcome", "to", "javatpoint");
		
		System.out.println(joinString1);
		System.out.println(joinStr);

		String date = String.join("/", "25", "06", "2018");
		System.out.print(date);
		String time = String.join(":", "12", "10", "10");
		System.out.println(" " + time);
	}

}