package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public StreamTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String... args) {
		
		Stream.of("bbb","aa","dd","cc")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		System.out.println(IntStream.range(1, 5).sum());
		
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		
		IntStream.range(1,10).skip(5).forEach(x->System.out.println(x));
		
		
		

		List<String> myList = new ArrayList<>();
		myList.add("pqr");
		myList.add("stu");
		myList.add("vwx");
		myList.add("yza");
		myList.add("bcd");
		myList.add("efg");
		myList.add("vwx");

		// strings starting with 'a'

		boolean res = myList.stream().anyMatch((a) -> a.startsWith("v"));
		System.out.println("Do any string begins with letter v = " + res);

		long noOfElements = myList.stream().filter(a -> a.startsWith("v")).count();
		System.out.println(noOfElements);

		// List<String> lisst = myList.stream().distinct().map(null)

		String str = "Malyalam";
		String[] prefixArr = { "Ga", "Ma", "yalam" };
		if (Stream.of(prefixArr).anyMatch(str::startsWith))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");

		////
		System.out.println("The stream after applying the function is : ");
		// Creating a list of Integers
		List<String> list = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");
		// Using Stream map(Function mapper) to convert the Strings in stream to
		// UpperCase form
		List<String> answer = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		// displaying the new stream of UpperCase Strings
		System.out.println(answer);

		//////
		System.out.println("The stream after applying " + "the function is : ");
		// Creating a list of Strings
		List<String> list2 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");
		// Using Stream map(Function mapper) and displaying the length of each String
		list2.stream().map(str2 -> str2.length()).forEach(System.out::println);

		// Creating a List of Strings
		List<String> listl = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");
		// Using Stream flatMap(Function mapper)
		listl.stream().flatMap(str3 -> Stream.of(str3.charAt(2))).forEach(System.out::println);

		// creating a list of Strings
		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
		// The lambda expression passed to reduce() method takes two Strings
		// and returns the longer String. The result of the reduce() method is
		// an Optional because the list on which reduce() is called may be empty.
		Optional<String> longestString = words.stream()
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		// Displaying the longest String
		longestString.ifPresent(System.out::println);

		// String array
		String[] array = { "Geeks", "for", "Geeks" };
		// The result of the reduce() method is an Optional because the list on which
		// reduce() is called may be empty.
		Optional<String> String_combine = Arrays.stream(array).reduce((str1, str2) -> str1 + "-" + str2);
		// Displaying the combined String
		if (String_combine.isPresent()) {
			System.out.println(String_combine.get());
		}
		
		
		List<Integer> array2 = Arrays.asList(-2, 0, 4, 6, 8);
		// Finding sum of all elements
		int sum = array2.stream().reduce(0, (element1, element2) -> element1 + element2);
		// Displaying sum of all elements
		System.out.println("The sum of all elements is " + sum);
		
		

		int product = IntStream.range(2, 8).reduce((num1, num2) -> num1 * num2).orElse(-1);
		// Displaying the product
		System.out.println("The product is : " + product);
	
		
	}
}
