package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap_FlatMap {

	public static void main(String[] args) {
		
		// Using Stream map(Function mapper) to convert the Strings in stream to UpperCase form
		System.out.println("The stream after applying the function is : ");
		List<String> list = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");		
		List<String> answer = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(answer);

		// Using Stream map(Function mapper) and displaying the length of each String		
		System.out.println("The stream after applying the map function str.length() is : ");
		List<String> list2 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");
		list2.stream().map(str -> str.length()).forEach(System.out::println);
		
		// Using Stream flatMap(Function mapper)
		System.out.println("The stream after applying the flatmap charAt(2) is : ");
		List<String> listl = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");
		listl.stream().flatMap(str2 -> Stream.of(str2.charAt(2))).forEach(System.out::println);

	}
}
