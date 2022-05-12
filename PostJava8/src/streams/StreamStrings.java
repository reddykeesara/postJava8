package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStrings {
	public static void main(String[] args) {
		
		//count all chars in a string
		String exampleString = "This is a sample string";
		long totalChars = exampleString.chars().count();
		System.out.println("This is a sample string (all chars) "+totalChars);
		
		//count no of chars in a string.
		String exampleString2 = "This is a sample string";
		long chars = exampleString2.chars().filter(ch -> ch == 's').count();
		System.out.println("This is a sample string (no of 's') "+chars);
		
		/******************************************************************************************/		
		//reverse a string
		String str = "raghu";
		String reversed = str.chars()
			    .mapToObj(c -> (char)c)
			    .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
		System.out.println(reversed);
		
		//Reverse a string other ways
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());
		
		StringBuilder sbl = new StringBuilder(str);
		System.out.println(sbl.reverse().toString());
		
		/******************************************************************************************/
	}
}
