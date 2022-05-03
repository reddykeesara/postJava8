package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

/* Stream.reduce 
Many times, we need to perform operations where a stream reduces to single resultant value, for example,
maximum, minimum, sum, product, etc. Reducing is the repeated process of combining all elements.

reduce operation applies a binary operator to each element in the stream where the first argument
to the operator is the return value of the previous application and second argument is the
current stream element

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T,T,T>
*/
public class StreamReduce {

	public static void main(String[] args) {

		/*
		 * The lambda expression passed to reduce() method takes two Strings and returns
		 * the longer String. The result of the reduce() method is an Optional because
		 * the list on which reduce() is called may be empty.
		 */
		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
		Optional<String> longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		System.out.print("Displaying the longest String :  ");
		longestString.ifPresent(System.out::println);

		
		//Combine the Strings
		String[] array = { "Geeks", "for", "Geeks" };
		// The result of the reduce() method is an Optional because the list on which reduce() is called may be empty.
		Optional<String> String_combine = Arrays.stream(array).reduce((str1, str2) -> str1 + "-" + str2);
		System.out.print("Displaying the combined String :  ");
		if (String_combine.isPresent()) {
			System.out.println(String_combine.get());
		}
		
		//Sum all the integer elements in a List
		List<Integer> array2 = Arrays.asList(-2, 0, 4, 6, 8);
		// Finding sum of all elements
		int sum = array2.stream().reduce(0, (element1, element2) -> element1 + element2);
		// Displaying sum of all elements
		System.out.println("The sum of all elements is " + sum);
		
		//Product of all the elements
		int product = IntStream.range(2, 8).reduce((num1, num2) -> num1 * num2).orElse(-1);
		// Displaying the product
		System.out.println("The product is : " + product);
		
		
		List<Integer> intList = Arrays.asList(2,3,4,5,6,7);
		int prod = intList.stream().reduce((int1, int2) -> int1-int2).orElse(-1);
		System.out.println("Product "+prod);
	}	
}
