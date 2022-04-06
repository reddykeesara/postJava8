package streams;

import java.util.Arrays;
import java.util.List;

public class StreamInteger {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
		  
        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements that are divisible by 5
        list.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
	}
}
